// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroups.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GroupResourceQuery {
    /**
     * The resource query as a JSON string.
     * 
     */
    private final String query;
    /**
     * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"query","type"})
    private GroupResourceQuery(
        String query,
        @Nullable String type) {
        this.query = query;
        this.type = type;
    }

    /**
     * The resource query as a JSON string.
     * 
    */
    public String getQuery() {
        return this.query;
    }
    /**
     * The type of the resource query. Defaults to `TAG_FILTERS_1_0`.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupResourceQuery defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String query;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupResourceQuery defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
    	      this.type = defaults.type;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public GroupResourceQuery build() {
            return new GroupResourceQuery(query, type);
        }
    }
}
