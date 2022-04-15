// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TransitGatewayPeeringAttachmentAccepterArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransitGatewayPeeringAttachmentAccepterArgs Empty = new TransitGatewayPeeringAttachmentAccepterArgs();

    /**
     * Key-value tags for the EC2 Transit Gateway Peering Attachment. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * The ID of the EC2 Transit Gateway Peering Attachment to manage.
     * 
     */
    @Import(name="transitGatewayAttachmentId", required=true)
      private final Output<String> transitGatewayAttachmentId;

    public Output<String> transitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    public TransitGatewayPeeringAttachmentAccepterArgs(
        @Nullable Output<Map<String,String>> tags,
        Output<String> transitGatewayAttachmentId) {
        this.tags = tags;
        this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId, "expected parameter 'transitGatewayAttachmentId' to be non-null");
    }

    private TransitGatewayPeeringAttachmentAccepterArgs() {
        this.tags = Codegen.empty();
        this.transitGatewayAttachmentId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransitGatewayPeeringAttachmentAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> transitGatewayAttachmentId;

        public Builder() {
    	      // Empty
        }

        public Builder(TransitGatewayPeeringAttachmentAccepterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.transitGatewayAttachmentId = defaults.transitGatewayAttachmentId;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder transitGatewayAttachmentId(Output<String> transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Objects.requireNonNull(transitGatewayAttachmentId);
            return this;
        }
        public Builder transitGatewayAttachmentId(String transitGatewayAttachmentId) {
            this.transitGatewayAttachmentId = Output.of(Objects.requireNonNull(transitGatewayAttachmentId));
            return this;
        }        public TransitGatewayPeeringAttachmentAccepterArgs build() {
            return new TransitGatewayPeeringAttachmentAccepterArgs(tags, transitGatewayAttachmentId);
        }
    }
}
