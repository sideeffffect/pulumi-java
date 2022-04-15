// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcIpamScopeState extends io.pulumi.resources.ResourceArgs {

    public static final VpcIpamScopeState Empty = new VpcIpamScopeState();

    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A description for the scope you're creating.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The ARN of the IPAM for which you're creating this scope.
     * 
     */
    @Import(name="ipamArn")
      private final @Nullable Output<String> ipamArn;

    public Output<String> ipamArn() {
        return this.ipamArn == null ? Codegen.empty() : this.ipamArn;
    }

    /**
     * The ID of the IPAM for which you're creating this scope.
     * 
     */
    @Import(name="ipamId")
      private final @Nullable Output<String> ipamId;

    public Output<String> ipamId() {
        return this.ipamId == null ? Codegen.empty() : this.ipamId;
    }

    @Import(name="ipamScopeType")
      private final @Nullable Output<String> ipamScopeType;

    public Output<String> ipamScopeType() {
        return this.ipamScopeType == null ? Codegen.empty() : this.ipamScopeType;
    }

    /**
     * Defines if the scope is the default scope or not.
     * 
     */
    @Import(name="isDefault")
      private final @Nullable Output<Boolean> isDefault;

    public Output<Boolean> isDefault() {
        return this.isDefault == null ? Codegen.empty() : this.isDefault;
    }

    /**
     * Count of pools under this scope
     * 
     */
    @Import(name="poolCount")
      private final @Nullable Output<Integer> poolCount;

    public Output<Integer> poolCount() {
        return this.poolCount == null ? Codegen.empty() : this.poolCount;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public VpcIpamScopeState(
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> ipamArn,
        @Nullable Output<String> ipamId,
        @Nullable Output<String> ipamScopeType,
        @Nullable Output<Boolean> isDefault,
        @Nullable Output<Integer> poolCount,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.description = description;
        this.ipamArn = ipamArn;
        this.ipamId = ipamId;
        this.ipamScopeType = ipamScopeType;
        this.isDefault = isDefault;
        this.poolCount = poolCount;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcIpamScopeState() {
        this.arn = Codegen.empty();
        this.description = Codegen.empty();
        this.ipamArn = Codegen.empty();
        this.ipamId = Codegen.empty();
        this.ipamScopeType = Codegen.empty();
        this.isDefault = Codegen.empty();
        this.poolCount = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcIpamScopeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipamArn;
        private @Nullable Output<String> ipamId;
        private @Nullable Output<String> ipamScopeType;
        private @Nullable Output<Boolean> isDefault;
        private @Nullable Output<Integer> poolCount;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcIpamScopeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.ipamArn = defaults.ipamArn;
    	      this.ipamId = defaults.ipamId;
    	      this.ipamScopeType = defaults.ipamScopeType;
    	      this.isDefault = defaults.isDefault;
    	      this.poolCount = defaults.poolCount;
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipamArn(@Nullable Output<String> ipamArn) {
            this.ipamArn = ipamArn;
            return this;
        }
        public Builder ipamArn(@Nullable String ipamArn) {
            this.ipamArn = Codegen.ofNullable(ipamArn);
            return this;
        }
        public Builder ipamId(@Nullable Output<String> ipamId) {
            this.ipamId = ipamId;
            return this;
        }
        public Builder ipamId(@Nullable String ipamId) {
            this.ipamId = Codegen.ofNullable(ipamId);
            return this;
        }
        public Builder ipamScopeType(@Nullable Output<String> ipamScopeType) {
            this.ipamScopeType = ipamScopeType;
            return this;
        }
        public Builder ipamScopeType(@Nullable String ipamScopeType) {
            this.ipamScopeType = Codegen.ofNullable(ipamScopeType);
            return this;
        }
        public Builder isDefault(@Nullable Output<Boolean> isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Builder isDefault(@Nullable Boolean isDefault) {
            this.isDefault = Codegen.ofNullable(isDefault);
            return this;
        }
        public Builder poolCount(@Nullable Output<Integer> poolCount) {
            this.poolCount = poolCount;
            return this;
        }
        public Builder poolCount(@Nullable Integer poolCount) {
            this.poolCount = Codegen.ofNullable(poolCount);
            return this;
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
        }        public VpcIpamScopeState build() {
            return new VpcIpamScopeState(arn, description, ipamArn, ipamId, ipamScopeType, isDefault, poolCount, tags, tagsAll);
        }
    }
}
