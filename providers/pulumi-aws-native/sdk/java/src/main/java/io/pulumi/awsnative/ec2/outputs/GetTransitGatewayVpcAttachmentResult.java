// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.OptionsProperties;
import io.pulumi.awsnative.ec2.outputs.TransitGatewayVpcAttachmentTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetTransitGatewayVpcAttachmentResult {
    private final @Nullable List<String> addSubnetIds;
    private final @Nullable String id;
    /**
     * The options for the transit gateway vpc attachment.
     * 
     */
    private final @Nullable OptionsProperties options;
    private final @Nullable List<String> removeSubnetIds;
    private final @Nullable List<TransitGatewayVpcAttachmentTag> tags;

    @OutputCustomType.Constructor
    private GetTransitGatewayVpcAttachmentResult(
        @OutputCustomType.Parameter("addSubnetIds") @Nullable List<String> addSubnetIds,
        @OutputCustomType.Parameter("id") @Nullable String id,
        @OutputCustomType.Parameter("options") @Nullable OptionsProperties options,
        @OutputCustomType.Parameter("removeSubnetIds") @Nullable List<String> removeSubnetIds,
        @OutputCustomType.Parameter("tags") @Nullable List<TransitGatewayVpcAttachmentTag> tags) {
        this.addSubnetIds = addSubnetIds;
        this.id = id;
        this.options = options;
        this.removeSubnetIds = removeSubnetIds;
        this.tags = tags;
    }

    public List<String> getAddSubnetIds() {
        return this.addSubnetIds == null ? List.of() : this.addSubnetIds;
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The options for the transit gateway vpc attachment.
     * 
    */
    public Optional<OptionsProperties> getOptions() {
        return Optional.ofNullable(this.options);
    }
    public List<String> getRemoveSubnetIds() {
        return this.removeSubnetIds == null ? List.of() : this.removeSubnetIds;
    }
    public List<TransitGatewayVpcAttachmentTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTransitGatewayVpcAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> addSubnetIds;
        private @Nullable String id;
        private @Nullable OptionsProperties options;
        private @Nullable List<String> removeSubnetIds;
        private @Nullable List<TransitGatewayVpcAttachmentTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTransitGatewayVpcAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addSubnetIds = defaults.addSubnetIds;
    	      this.id = defaults.id;
    	      this.options = defaults.options;
    	      this.removeSubnetIds = defaults.removeSubnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder addSubnetIds(@Nullable List<String> addSubnetIds) {
            this.addSubnetIds = addSubnetIds;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder options(@Nullable OptionsProperties options) {
            this.options = options;
            return this;
        }

        public Builder removeSubnetIds(@Nullable List<String> removeSubnetIds) {
            this.removeSubnetIds = removeSubnetIds;
            return this;
        }

        public Builder tags(@Nullable List<TransitGatewayVpcAttachmentTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetTransitGatewayVpcAttachmentResult build() {
            return new GetTransitGatewayVpcAttachmentResult(addSubnetIds, id, options, removeSubnetIds, tags);
        }
    }
}
