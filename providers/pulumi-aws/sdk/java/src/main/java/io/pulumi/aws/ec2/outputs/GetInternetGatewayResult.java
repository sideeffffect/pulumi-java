// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetInternetGatewayAttachment;
import io.pulumi.aws.ec2.outputs.GetInternetGatewayFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInternetGatewayResult {
    /**
     * The ARN of the Internet Gateway.
     * 
     */
    private final String arn;
    private final List<GetInternetGatewayAttachment> attachments;
    private final @Nullable List<GetInternetGatewayFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String internetGatewayId;
    /**
     * The ID of the AWS account that owns the internet gateway.
     * 
     */
    private final String ownerId;
    private final Map<String,String> tags;

    @OutputCustomType.Constructor
    private GetInternetGatewayResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("attachments") List<GetInternetGatewayAttachment> attachments,
        @OutputCustomType.Parameter("filters") @Nullable List<GetInternetGatewayFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("internetGatewayId") String internetGatewayId,
        @OutputCustomType.Parameter("ownerId") String ownerId,
        @OutputCustomType.Parameter("tags") Map<String,String> tags) {
        this.arn = arn;
        this.attachments = attachments;
        this.filters = filters;
        this.id = id;
        this.internetGatewayId = internetGatewayId;
        this.ownerId = ownerId;
        this.tags = tags;
    }

    /**
     * The ARN of the Internet Gateway.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    public List<GetInternetGatewayAttachment> getAttachments() {
        return this.attachments;
    }
    public List<GetInternetGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public String getInternetGatewayId() {
        return this.internetGatewayId;
    }
    /**
     * The ID of the AWS account that owns the internet gateway.
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInternetGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetInternetGatewayAttachment> attachments;
        private @Nullable List<GetInternetGatewayFilter> filters;
        private String id;
        private String internetGatewayId;
        private String ownerId;
        private Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInternetGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attachments = defaults.attachments;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.internetGatewayId = defaults.internetGatewayId;
    	      this.ownerId = defaults.ownerId;
    	      this.tags = defaults.tags;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder attachments(List<GetInternetGatewayAttachment> attachments) {
            this.attachments = Objects.requireNonNull(attachments);
            return this;
        }

        public Builder filters(@Nullable List<GetInternetGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder internetGatewayId(String internetGatewayId) {
            this.internetGatewayId = Objects.requireNonNull(internetGatewayId);
            return this;
        }

        public Builder ownerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetInternetGatewayResult build() {
            return new GetInternetGatewayResult(arn, attachments, filters, id, internetGatewayId, ownerId, tags);
        }
    }
}
