async function getUserData() {
    const usernameInput = document.getElementById('usernameInput');
    const username = usernameInput.value.trim();

    if (username) {
        try {
            const userDataResponse = await fetch(`https://api.github.com/users/${username}`);
            const userData = await userDataResponse.json();
            if (userData.message && userData.message === 'Not Found') {
                alert('User not found. Please try again.');
                return;
            }
            const repositoriesResponse = await fetch(`https://api.github.com/users/${username}/repos`);
            const repositoriesData = await repositoriesResponse.json();
            const activityResponse = await fetch(`https://api.github.com/users/${username}/events`);
            const activityData = await activityResponse.json();

            displayUserData(userData);
            displayRepositories(repositoriesData);
            displayActivity(activityData);
        } catch (error) {
            console.error('Error:', error);
            alert('An error occurred. Please try again.');
        }
    } else {
        alert('Please enter a GitHub username.');
    }
}

function displayUserData(userData) {
    const profile = document.getElementById('profile');
    profile.innerHTML = `
        <img src="${userData.avatar_url}" alt="Profile Picture">
        <h2>${userData.name}</h2>
        <p>${userData.bio}</p>
        <p><strong>Location:</strong> ${userData.location}</p>
        <p><strong>Followers:</strong> ${userData.followers}</p>
        <p><strong>Following:</strong> ${userData.following}</p>
    `;
}

function displayRepositories(repositoriesData) {
    const repositories = document.getElementById('repositories');
    repositories.innerHTML = '<h3>Repositories:</h3>';
    repositoriesData.forEach(repository => {
        const repositoryItem = document.createElement('div');
        repositoryItem.classList.add('repository');
        repositoryItem.innerHTML = `
            <h4>${repository.name}</h4>
            <p>${repository.description}</p>
            <p><strong>Stars:</strong> ${repository.stargazers_count}</p>
        `;
        repositories.appendChild(repositoryItem);
    });
}

function displayActivity(activityData) {
    const activity = document.getElementById('activity');
    activity.innerHTML = '<h3>Recent Activity:</h3>';
    activityData.forEach(activityItem => {
        const activityItemElement = document.createElement('div');
        activityItemElement.classList.add('activity');
        let activityDescription = '';
        switch (activityItem.type) {
            case 'PushEvent':
                activityDescription = `Pushed to ${activityItem.payload.ref.replace('refs/heads/', '')} in ${activityItem.repo.name}`;
                break;
            case 'PullRequestEvent':
                activityDescription = `Opened a pull request in ${activityItem.repo.name}`;
                break;
            case 'IssuesEvent':
                activityDescription = `Opened an issue in ${activityItem.repo.name}`;
                break;
            default:
                break;
        }
        activityItemElement.innerHTML = `
            <p>${activityDescription}</p>
            <p><strong>Date:</strong> ${new Date(activityItem.created_at).toLocaleString()}</p>
        `;
        activity.appendChild(activityItemElement);
    });
}
