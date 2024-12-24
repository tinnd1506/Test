module.exports = {
    extends: ['@commitlint/config-conventional'],
    rules: {
      'type-enum': [2, 'always', ['feat', 'fix', 'docs', 'style', 'refactor', 'test', 'chore']],
      'subject-case': [2, 'always', 'sentence-case'],
      'subject-empty': [2, 'never'],
      'subject-full-stop': [2, 'never', '.'],
      'body-leading-blank': [2, 'always'],
      'footer-leading-blank': [2, 'always'],
    },
  };