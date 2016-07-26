# cd "$( dirname "${BASH_SOURCE[0]}" )"
rm -rf src/main/generated/com/billinghouse/jooq
mvn org.jooq:jooq-codegen-maven:generate@crm

