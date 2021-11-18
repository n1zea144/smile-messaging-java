# Fix # (see https://help.github.com/en/articles/closing-issues-using-keywords)

Briefly describe changes proposed in this pull request:
- a
- b

--

## Troubleshooting

### Expected behavior

### Actual behavior

### Logs, error output, or stacktrace

### Steps to reproduce the behavior

### Tasks

Include specific tasks in the order they need to be done in. Include links to specific lines of code where the task should happen at.

- [ ] task 1
- [ ] task 2
- [ ] task 3

### Screenshots

--

## Crossing T's and dotting I's

Please follow these checklists to help prevent any unexpected issues from being introduced by the changes in this pull request. If an item does not apply then indicate so by surrounding the line item with `~~` to strikethrough the text. See [basic writing and formatting syntax](https://docs.github.com/en/github/writing-on-github/getting-started-with-writing-and-formatting-on-github/basic-writing-and-formatting-syntax) for more information.

### Messaging gateway checklist:
- [ ] Have these changes been tested and built against the other MetaDB services?
  - [ ] cmo-metadb
  - [ ] cmo-metadb-request-filter
  - [ ] cmo-metadb-label-generator
  - [ ] cmo-metadb-consistency-checker
  - [ ] cmo-metadb-cpt-gateway
  - [ ] cmo-metadb-sample-publisher
  - [ ] cmo-metadb-irt-publisher
  - [ ] limsrest

### Message handlers checklist:
- [ ] Were changes introduced in this PR that may affect the workflow of incoming messages?
- [ ] Are messages following the expected workflow when published to the topic(s) changed in this pull request?
- [ ] Were unit tests added to ensure messages are handled as expected?

If no unit tests were updated or added, then please explain why: [insert details here]

Please describe how the workflow and messaging was tested/simulated:

**Your environment**

- NATS [local, local docker, dev server, production]
- Neo4j [local, local docker, dev server, production]
- MetaDB [local, local docker, dev server, production]
- Message publishing simulation [nats cli, docker nats cli, metadb publisher tool, other (describe below)]

Other: [insert details on how messages were published or simulated for testing]

### General checklist:
- [ ] Have tests or has a separate issue that describes the types of tests that should be created been linked? If no test is included it should explicitly be mentioned in the PR why there is no test.
- [ ] The commit log is comprehensible. It follows [7 rules of great commit messages](http://chris.beams.io/posts/git-commit/). For most PRs a single commit should suffice, in some cases multiple topical commits can be useful. During review it is ok to see tiny commits (e.g. Fix reviewer comments), but right before the code gets merged to master or rc branch, any such commits should be squashed since they are useless to the other developers. Definitely avoid [merge commits, use rebase instead.](http://nathanleclaire.com/blog/2014/09/14/dont-be-scared-of-git-rebase/)