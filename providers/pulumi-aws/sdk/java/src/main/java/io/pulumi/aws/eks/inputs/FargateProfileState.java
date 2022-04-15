// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.aws.eks.inputs.FargateProfileSelectorGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FargateProfileState extends io.pulumi.resources.ResourceArgs {

    public static final FargateProfileState Empty = new FargateProfileState();

    /**
     * Amazon Resource Name (ARN) of the EKS Fargate Profile.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Name of the EKS Cluster. Must be between 1-100 characters in length. Must begin with an alphanumeric character, and must only contain alphanumeric characters, dashes and underscores (`^[0-9A-Za-z][A-Za-z0-9\-_]+$`).
     * 
     */
    @Import(name="clusterName")
      private final @Nullable Output<String> clusterName;

    public Output<String> clusterName() {
        return this.clusterName == null ? Codegen.empty() : this.clusterName;
    }

    /**
     * Name of the EKS Fargate Profile.
     * 
     */
    @Import(name="fargateProfileName")
      private final @Nullable Output<String> fargateProfileName;

    public Output<String> fargateProfileName() {
        return this.fargateProfileName == null ? Codegen.empty() : this.fargateProfileName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role that provides permissions for the EKS Fargate Profile.
     * 
     */
    @Import(name="podExecutionRoleArn")
      private final @Nullable Output<String> podExecutionRoleArn;

    public Output<String> podExecutionRoleArn() {
        return this.podExecutionRoleArn == null ? Codegen.empty() : this.podExecutionRoleArn;
    }

    /**
     * Configuration block(s) for selecting Kubernetes Pods to execute with this EKS Fargate Profile. Detailed below.
     * 
     */
    @Import(name="selectors")
      private final @Nullable Output<List<FargateProfileSelectorGetArgs>> selectors;

    public Output<List<FargateProfileSelectorGetArgs>> selectors() {
        return this.selectors == null ? Codegen.empty() : this.selectors;
    }

    /**
     * Status of the EKS Fargate Profile.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> status() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * Identifiers of private EC2 Subnets to associate with the EKS Fargate Profile. These subnets must have the following resource tag: `kubernetes.io/cluster/CLUSTER_NAME` (where `CLUSTER_NAME` is replaced with the name of the EKS Cluster).
     * 
     */
    @Import(name="subnetIds")
      private final @Nullable Output<List<String>> subnetIds;

    public Output<List<String>> subnetIds() {
        return this.subnetIds == null ? Codegen.empty() : this.subnetIds;
    }

    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public FargateProfileState(
        @Nullable Output<String> arn,
        @Nullable Output<String> clusterName,
        @Nullable Output<String> fargateProfileName,
        @Nullable Output<String> podExecutionRoleArn,
        @Nullable Output<List<FargateProfileSelectorGetArgs>> selectors,
        @Nullable Output<String> status,
        @Nullable Output<List<String>> subnetIds,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.clusterName = clusterName;
        this.fargateProfileName = fargateProfileName;
        this.podExecutionRoleArn = podExecutionRoleArn;
        this.selectors = selectors;
        this.status = status;
        this.subnetIds = subnetIds;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private FargateProfileState() {
        this.arn = Codegen.empty();
        this.clusterName = Codegen.empty();
        this.fargateProfileName = Codegen.empty();
        this.podExecutionRoleArn = Codegen.empty();
        this.selectors = Codegen.empty();
        this.status = Codegen.empty();
        this.subnetIds = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FargateProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> clusterName;
        private @Nullable Output<String> fargateProfileName;
        private @Nullable Output<String> podExecutionRoleArn;
        private @Nullable Output<List<FargateProfileSelectorGetArgs>> selectors;
        private @Nullable Output<String> status;
        private @Nullable Output<List<String>> subnetIds;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(FargateProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.clusterName = defaults.clusterName;
    	      this.fargateProfileName = defaults.fargateProfileName;
    	      this.podExecutionRoleArn = defaults.podExecutionRoleArn;
    	      this.selectors = defaults.selectors;
    	      this.status = defaults.status;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder clusterName(@Nullable Output<String> clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = Codegen.ofNullable(clusterName);
            return this;
        }
        public Builder fargateProfileName(@Nullable Output<String> fargateProfileName) {
            this.fargateProfileName = fargateProfileName;
            return this;
        }
        public Builder fargateProfileName(@Nullable String fargateProfileName) {
            this.fargateProfileName = Codegen.ofNullable(fargateProfileName);
            return this;
        }
        public Builder podExecutionRoleArn(@Nullable Output<String> podExecutionRoleArn) {
            this.podExecutionRoleArn = podExecutionRoleArn;
            return this;
        }
        public Builder podExecutionRoleArn(@Nullable String podExecutionRoleArn) {
            this.podExecutionRoleArn = Codegen.ofNullable(podExecutionRoleArn);
            return this;
        }
        public Builder selectors(@Nullable Output<List<FargateProfileSelectorGetArgs>> selectors) {
            this.selectors = selectors;
            return this;
        }
        public Builder selectors(@Nullable List<FargateProfileSelectorGetArgs> selectors) {
            this.selectors = Codegen.ofNullable(selectors);
            return this;
        }
        public Builder selectors(FargateProfileSelectorGetArgs... selectors) {
            return selectors(List.of(selectors));
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder subnetIds(@Nullable Output<List<String>> subnetIds) {
            this.subnetIds = subnetIds;
            return this;
        }
        public Builder subnetIds(@Nullable List<String> subnetIds) {
            this.subnetIds = Codegen.ofNullable(subnetIds);
            return this;
        }
        public Builder subnetIds(String... subnetIds) {
            return subnetIds(List.of(subnetIds));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public FargateProfileState build() {
            return new FargateProfileState(arn, clusterName, fargateProfileName, podExecutionRoleArn, selectors, status, subnetIds, tags, tagsAll);
        }
    }
}
