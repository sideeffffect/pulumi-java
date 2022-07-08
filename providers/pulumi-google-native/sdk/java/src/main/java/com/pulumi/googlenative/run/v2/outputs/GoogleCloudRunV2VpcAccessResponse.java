// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run.v2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudRunV2VpcAccessResponse {
    /**
     * @return VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}
     * 
     */
    private final String connector;
    /**
     * @return Traffic VPC egress settings.
     * 
     */
    private final String egress;

    @CustomType.Constructor
    private GoogleCloudRunV2VpcAccessResponse(
        @CustomType.Parameter("connector") String connector,
        @CustomType.Parameter("egress") String egress) {
        this.connector = connector;
        this.egress = egress;
    }

    /**
     * @return VPC Access connector name. Format: projects/{project}/locations/{location}/connectors/{connector}
     * 
     */
    public String connector() {
        return this.connector;
    }
    /**
     * @return Traffic VPC egress settings.
     * 
     */
    public String egress() {
        return this.egress;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunV2VpcAccessResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connector;
        private String egress;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunV2VpcAccessResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connector = defaults.connector;
    	      this.egress = defaults.egress;
        }

        public Builder connector(String connector) {
            this.connector = Objects.requireNonNull(connector);
            return this;
        }
        public Builder egress(String egress) {
            this.egress = Objects.requireNonNull(egress);
            return this;
        }        public GoogleCloudRunV2VpcAccessResponse build() {
            return new GoogleCloudRunV2VpcAccessResponse(connector, egress);
        }
    }
}
