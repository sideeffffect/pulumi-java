// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * ResourceRecordSet data for one geo location.
 * 
 */
public final class RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse extends com.pulumi.resources.InvokeArgs {

    public static final RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse Empty = new RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse();

    @Import(name="kind", required=true)
      private final String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
     * 
     */
    @Import(name="location", required=true)
      private final String location;

    public String location() {
        return this.location;
    }

    @Import(name="rrdatas", required=true)
      private final List<String> rrdatas;

    public List<String> rrdatas() {
        return this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    @Import(name="signatureRrdatas", required=true)
      private final List<String> signatureRrdatas;

    public List<String> signatureRrdatas() {
        return this.signatureRrdatas;
    }

    public RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse(
        String kind,
        String location,
        List<String> rrdatas,
        List<String> signatureRrdatas) {
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.rrdatas = Objects.requireNonNull(rrdatas, "expected parameter 'rrdatas' to be non-null");
        this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas, "expected parameter 'signatureRrdatas' to be non-null");
    }

    private RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse() {
        this.kind = null;
        this.location = null;
        this.rrdatas = List.of();
        this.signatureRrdatas = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kind;
        private String location;
        private List<String> rrdatas;
        private List<String> signatureRrdatas;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
        }

        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder rrdatas(List<String> rrdatas) {
            this.rrdatas = Objects.requireNonNull(rrdatas);
            return this;
        }
        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }
        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            this.signatureRrdatas = Objects.requireNonNull(signatureRrdatas);
            return this;
        }
        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }        public RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse build() {
            return new RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse(kind, location, rrdatas, signatureRrdatas);
        }
    }
}
