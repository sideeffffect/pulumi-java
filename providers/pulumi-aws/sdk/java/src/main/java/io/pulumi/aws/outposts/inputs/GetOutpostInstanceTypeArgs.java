// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outposts.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetOutpostInstanceTypeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOutpostInstanceTypeArgs Empty = new GetOutpostInstanceTypeArgs();

    /**
     * Outpost Amazon Resource Name (ARN).
     * 
     */
    @InputImport(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    /**
     * Desired instance type. Conflicts with `preferred_instance_types`.
     * 
     */
    @InputImport(name="instanceType")
      private final @Nullable String instanceType;

    public Optional<String> getInstanceType() {
        return this.instanceType == null ? Optional.empty() : Optional.ofNullable(this.instanceType);
    }

    /**
     * Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instance_type`.
     * 
     */
    @InputImport(name="preferredInstanceTypes")
      private final @Nullable List<String> preferredInstanceTypes;

    public List<String> getPreferredInstanceTypes() {
        return this.preferredInstanceTypes == null ? List.of() : this.preferredInstanceTypes;
    }

    public GetOutpostInstanceTypeArgs(
        String arn,
        @Nullable String instanceType,
        @Nullable List<String> preferredInstanceTypes) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
        this.instanceType = instanceType;
        this.preferredInstanceTypes = preferredInstanceTypes;
    }

    private GetOutpostInstanceTypeArgs() {
        this.arn = null;
        this.instanceType = null;
        this.preferredInstanceTypes = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOutpostInstanceTypeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable String instanceType;
        private @Nullable List<String> preferredInstanceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOutpostInstanceTypeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.instanceType = defaults.instanceType;
    	      this.preferredInstanceTypes = defaults.preferredInstanceTypes;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder instanceType(@Nullable String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        public Builder preferredInstanceTypes(@Nullable List<String> preferredInstanceTypes) {
            this.preferredInstanceTypes = preferredInstanceTypes;
            return this;
        }
        public GetOutpostInstanceTypeArgs build() {
            return new GetOutpostInstanceTypeArgs(arn, instanceType, preferredInstanceTypes);
        }
    }
}
