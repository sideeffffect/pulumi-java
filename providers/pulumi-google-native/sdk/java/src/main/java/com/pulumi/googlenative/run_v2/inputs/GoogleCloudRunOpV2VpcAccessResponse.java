// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * VPC Access settings. For more information on creating a VPC Connector, visit https://cloud.google.com/vpc/docs/configure-serverless-vpc-access For information on how to configure Cloud Run with an existing VPC Connector, visit https://cloud.google.com/run/docs/configuring/connecting-vpc
 * 
 */
public final class GoogleCloudRunOpV2VpcAccessResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2VpcAccessResponse Empty = new GoogleCloudRunOpV2VpcAccessResponse();

    /**
     * VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}
     * 
     */
    @Import(name="connector", required=true)
    private String connector;

    public String connector() {
        return this.connector;
    }

    /**
     * Traffic VPC egress settings.
     * 
     */
    @Import(name="egress", required=true)
    private String egress;

    public String egress() {
        return this.egress;
    }

    private GoogleCloudRunOpV2VpcAccessResponse() {}

    private GoogleCloudRunOpV2VpcAccessResponse(GoogleCloudRunOpV2VpcAccessResponse $) {
        this.connector = $.connector;
        this.egress = $.egress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRunOpV2VpcAccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRunOpV2VpcAccessResponse $;

        public Builder() {
            $ = new GoogleCloudRunOpV2VpcAccessResponse();
        }

        public Builder(GoogleCloudRunOpV2VpcAccessResponse defaults) {
            $ = new GoogleCloudRunOpV2VpcAccessResponse(Objects.requireNonNull(defaults));
        }

        public Builder connector(String connector) {
            $.connector = connector;
            return this;
        }

        public Builder egress(String egress) {
            $.egress = egress;
            return this;
        }

        public GoogleCloudRunOpV2VpcAccessResponse build() {
            $.connector = Objects.requireNonNull($.connector, "expected parameter 'connector' to be non-null");
            $.egress = Objects.requireNonNull($.egress, "expected parameter 'egress' to be non-null");
            return $;
        }
    }

}
