// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.shield;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProtectionGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProtectionGroupArgs Empty = new ProtectionGroupArgs();

    /**
     * Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
     * 
     */
    @InputImport(name="aggregation", required=true)
      private final Input<String> aggregation;

    public Input<String> getAggregation() {
        return this.aggregation;
    }

    /**
     * The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
     * 
     */
    @InputImport(name="members")
      private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The criteria to use to choose the protected resources for inclusion in the group.
     * 
     */
    @InputImport(name="pattern", required=true)
      private final Input<String> pattern;

    public Input<String> getPattern() {
        return this.pattern;
    }

    /**
     * The name of the protection group.
     * 
     */
    @InputImport(name="protectionGroupId", required=true)
      private final Input<String> protectionGroupId;

    public Input<String> getProtectionGroupId() {
        return this.protectionGroupId;
    }

    /**
     * The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
     * 
     */
    @InputImport(name="resourceType")
      private final @Nullable Input<String> resourceType;

    public Input<String> getPropResourceType() {
        return this.resourceType == null ? Input.empty() : this.resourceType;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ProtectionGroupArgs(
        Input<String> aggregation,
        @Nullable Input<List<String>> members,
        Input<String> pattern,
        Input<String> protectionGroupId,
        @Nullable Input<String> resourceType,
        @Nullable Input<Map<String,String>> tags) {
        this.aggregation = Objects.requireNonNull(aggregation, "expected parameter 'aggregation' to be non-null");
        this.members = members;
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
        this.protectionGroupId = Objects.requireNonNull(protectionGroupId, "expected parameter 'protectionGroupId' to be non-null");
        this.resourceType = resourceType;
        this.tags = tags;
    }

    private ProtectionGroupArgs() {
        this.aggregation = Input.empty();
        this.members = Input.empty();
        this.pattern = Input.empty();
        this.protectionGroupId = Input.empty();
        this.resourceType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProtectionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> aggregation;
        private @Nullable Input<List<String>> members;
        private Input<String> pattern;
        private Input<String> protectionGroupId;
        private @Nullable Input<String> resourceType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProtectionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregation = defaults.aggregation;
    	      this.members = defaults.members;
    	      this.pattern = defaults.pattern;
    	      this.protectionGroupId = defaults.protectionGroupId;
    	      this.resourceType = defaults.resourceType;
    	      this.tags = defaults.tags;
        }

        public Builder aggregation(Input<String> aggregation) {
            this.aggregation = Objects.requireNonNull(aggregation);
            return this;
        }

        public Builder aggregation(String aggregation) {
            this.aggregation = Input.of(Objects.requireNonNull(aggregation));
            return this;
        }

        public Builder members(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder members(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder pattern(Input<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder pattern(String pattern) {
            this.pattern = Input.of(Objects.requireNonNull(pattern));
            return this;
        }

        public Builder protectionGroupId(Input<String> protectionGroupId) {
            this.protectionGroupId = Objects.requireNonNull(protectionGroupId);
            return this;
        }

        public Builder protectionGroupId(String protectionGroupId) {
            this.protectionGroupId = Input.of(Objects.requireNonNull(protectionGroupId));
            return this;
        }

        public Builder resourceType(@Nullable Input<String> resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(@Nullable String resourceType) {
            this.resourceType = Input.ofNullable(resourceType);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ProtectionGroupArgs build() {
            return new ProtectionGroupArgs(aggregation, members, pattern, protectionGroupId, resourceType, tags);
        }
    }
}
