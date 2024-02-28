def checkoutCode() {
    checkout scm
}


#new changes added for rebase

def poetryInstall() {
    sh '''
    yum install 
    pip install poetry
    ~/.local/bin/poetry install
    '''
}

def pytestRun() {
    sh '~/.local/bin/poetry run python -m pytest'
}