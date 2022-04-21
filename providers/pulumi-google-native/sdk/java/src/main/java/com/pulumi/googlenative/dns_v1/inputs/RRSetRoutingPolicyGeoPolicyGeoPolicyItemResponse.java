// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

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
    private String kind;

    public String kind() {
        return this.kind;
    }

    /**
     * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. &#34;us-east1&#34;, &#34;southamerica-east1&#34;, &#34;asia-east1&#34;, etc.
     * 
     */
    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="rrdatas", required=true)
    private List<String> rrdatas;

    public List<String> rrdatas() {
        return this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there&#39;s a restriction of 1 ip per item. .
     * 
     */
    @Import(name="signatureRrdatas", required=true)
    private List<String> signatureRrdatas;

    public List<String> signatureRrdatas() {
        return this.signatureRrdatas;
    }

    private RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse() {}

    private RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse $) {
        this.kind = $.kind;
        this.location = $.location;
        this.rrdatas = $.rrdatas;
        this.signatureRrdatas = $.signatureRrdatas;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse $;

        public Builder() {
            $ = new RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse();
        }

        public Builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse defaults) {
            $ = new RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse(Objects.requireNonNull(defaults));
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder rrdatas(List<String> rrdatas) {
            $.rrdatas = rrdatas;
            return this;
        }

        public Builder rrdatas(String... rrdatas) {
            return rrdatas(List.of(rrdatas));
        }

        public Builder signatureRrdatas(List<String> signatureRrdatas) {
            $.signatureRrdatas = signatureRrdatas;
            return this;
        }

        public Builder signatureRrdatas(String... signatureRrdatas) {
            return signatureRrdatas(List.of(signatureRrdatas));
        }

        public RRSetRoutingPolicyGeoPolicyGeoPolicyItemResponse build() {
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.rrdatas = Objects.requireNonNull($.rrdatas, "expected parameter 'rrdatas' to be non-null");
            $.signatureRrdatas = Objects.requireNonNull($.signatureRrdatas, "expected parameter 'signatureRrdatas' to be non-null");
            return $;
        }
    }

}
