// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetDefaultTagsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Blocks of default tags set on the provider. See details below.
     * 
     */
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetDefaultTagsResult(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.id = id;
        this.tags = tags;
    }

    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Blocks of default tags set on the provider. See details below.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDefaultTagsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDefaultTagsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetDefaultTagsResult build() {
            return new GetDefaultTagsResult(id, tags);
        }
    }
}
