def checkoutCode() {
    checkout scm
}

def poetryInstall() {
    sh '''
    pip install poetry
    ~/.local/bin/poetry install
    '''
}

def pytestRun() {
    sh '~/.local/bin/poetry run python -m pytest'
}