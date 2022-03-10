// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetGroupsGroupGroupKey {
    private final String id;
    private final String namespace;

    @OutputCustomType.Constructor
    private GetGroupsGroupGroupKey(
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("namespace") String namespace) {
        this.id = id;
        this.namespace = namespace;
    }

    public String getId() {
        return this.id;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGroupsGroupGroupKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGroupsGroupGroupKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.namespace = defaults.namespace;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = Objects.requireNonNull(namespace);
            return this;
        }
        public GetGroupsGroupGroupKey build() {
            return new GetGroupsGroupGroupKey(id, namespace);
        }
    }
}
