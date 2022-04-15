// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.resourcegroupstaggingapi.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourcesTagFilter extends io.pulumi.resources.InvokeArgs {

    public static final GetResourcesTagFilter Empty = new GetResourcesTagFilter();

    /**
     * One part of a key-value pair that makes up a tag.
     * 
     */
    @Import(name="key", required=true)
      private final String key;

    public String key() {
        return this.key;
    }

    /**
     * The optional part of a key-value pair that make up a tag.
     * 
     */
    @Import(name="values")
      private final @Nullable List<String> values;

    public List<String> values() {
        return this.values == null ? List.of() : this.values;
    }

    public GetResourcesTagFilter(
        String key,
        @Nullable List<String> values) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.values = values;
    }

    private GetResourcesTagFilter() {
        this.key = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourcesTagFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourcesTagFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder values(@Nullable List<String> values) {
            this.values = values;
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetResourcesTagFilter build() {
            return new GetResourcesTagFilter(key, values);
        }
    }
}
