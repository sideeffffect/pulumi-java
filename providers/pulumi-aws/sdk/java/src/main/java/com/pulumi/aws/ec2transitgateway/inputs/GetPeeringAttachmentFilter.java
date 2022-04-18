// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2transitgateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetPeeringAttachmentFilter extends com.pulumi.resources.InvokeArgs {

    public static final GetPeeringAttachmentFilter Empty = new GetPeeringAttachmentFilter();

    /**
     * The name of the field to filter by, as defined by
     * [the underlying AWS API](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeTransitGatewayPeeringAttachments.html).
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Set of values that are accepted for the given field.
     * An EC2 Transit Gateway Peering Attachment be selected if any one of the given values matches.
     * 
     */
    @Import(name="values", required=true)
      private final List<String> values;

    public List<String> values() {
        return this.values;
    }

    public GetPeeringAttachmentFilter(
        String name,
        List<String> values) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.values = Objects.requireNonNull(values, "expected parameter 'values' to be non-null");
    }

    private GetPeeringAttachmentFilter() {
        this.name = null;
        this.values = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringAttachmentFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringAttachmentFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.values = defaults.values;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }        public GetPeeringAttachmentFilter build() {
            return new GetPeeringAttachmentFilter(name, values);
        }
    }
}
