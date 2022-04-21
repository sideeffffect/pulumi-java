// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.resourcegroups.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupTagFilter extends com.pulumi.resources.InvokeArgs {

    public static final GroupTagFilter Empty = new GroupTagFilter();

    @Import(name="key")
    private @Nullable String key;

    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="values")
    private @Nullable List<String> values;

    public Optional<List<String>> values() {
        return Optional.ofNullable(this.values);
    }

    private GroupTagFilter() {}

    private GroupTagFilter(GroupTagFilter $) {
        this.key = $.key;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupTagFilter $;

        public Builder() {
            $ = new GroupTagFilter();
        }

        public Builder(GroupTagFilter defaults) {
            $ = new GroupTagFilter(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable String key) {
            $.key = key;
            return this;
        }

        public Builder values(@Nullable List<String> values) {
            $.values = values;
            return this;
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public GroupTagFilter build() {
            return $;
        }
    }

}
