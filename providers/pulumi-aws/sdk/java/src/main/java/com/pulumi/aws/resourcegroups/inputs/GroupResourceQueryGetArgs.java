// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.resourcegroups.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupResourceQueryGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final GroupResourceQueryGetArgs Empty = new GroupResourceQueryGetArgs();

    /**
     * The resource query as a JSON string.
     * 
     */
    @Import(name="query", required=true)
    private Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    /**
     * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private GroupResourceQueryGetArgs() {}

    private GroupResourceQueryGetArgs(GroupResourceQueryGetArgs $) {
        this.query = $.query;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupResourceQueryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupResourceQueryGetArgs $;

        public Builder() {
            $ = new GroupResourceQueryGetArgs();
        }

        public Builder(GroupResourceQueryGetArgs defaults) {
            $ = new GroupResourceQueryGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        public Builder type(String type) {
            return type(Output.of(type));
        }

        public GroupResourceQueryGetArgs build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}
