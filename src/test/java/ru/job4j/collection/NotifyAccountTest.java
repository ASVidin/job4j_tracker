package ru.job4j.collection;

import org.hamcrest.core.Is;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class NotifyAccountTest {

    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        HashSet<Account> expect = new HashSet<>(
                Arrays.asList(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
                )
        );
        assertThat(NotifyAccount.sent(accounts), Is.is(expect));
    }

    @Test
    public void removeDuplicateAccount() {
        List<Account> accounts = Arrays.asList(
                new Account("142", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "eDer3432f")
        );
        HashSet<Account> expect = new HashSet<>(
                List.of(
                        new Account("142", "Petr Arsentev", "eDer3432f")
                )
        );
        assertThat(NotifyAccount.sent(accounts), Is.is(expect));
    }
}