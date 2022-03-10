// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceRecordSet data for one geo location.
 * 
 */
public final class RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs Empty = new RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs();

    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * The geo-location granularity is a GCP region. This location string should correspond to a GCP region. e.g. "us-east1", "southamerica-east1", "asia-east1", etc.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="rrdatas")
      private final @Nullable Input<List<String>> rrdatas;

    public Input<List<String>> getRrdatas() {
        return this.rrdatas == null ? Input.empty() : this.rrdatas;
    }

    /**
     * DNSSEC generated signatures for all the rrdata within this item. Note that if health checked targets are provided for DNSSEC enabled zones, there's a restriction of 1 ip per item. .
     * 
     */
    @InputImport(name="signatureRrdatas")
      private final @Nullable Input<List<String>> signatureRrdatas;

    public Input<List<String>> getSignatureRrdatas() {
        return this.signatureRrdatas == null ? Input.empty() : this.signatureRrdatas;
    }

    public RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs(
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<List<String>> rrdatas,
        @Nullable Input<List<String>> signatureRrdatas) {
        this.kind = kind;
        this.location = location;
        this.rrdatas = rrdatas;
        this.signatureRrdatas = signatureRrdatas;
    }

    private RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs() {
        this.kind = Input.empty();
        this.location = Input.empty();
        this.rrdatas = Input.empty();
        this.signatureRrdatas = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<List<String>> rrdatas;
        private @Nullable Input<List<String>> signatureRrdatas;

        public Builder() {
    	      // Empty
        }

        public Builder(RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.rrdatas = defaults.rrdatas;
    	      this.signatureRrdatas = defaults.signatureRrdatas;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder rrdatas(@Nullable Input<List<String>> rrdatas) {
            this.rrdatas = rrdatas;
            return this;
        }

        public Builder rrdatas(@Nullable List<String> rrdatas) {
            this.rrdatas = Input.ofNullable(rrdatas);
            return this;
        }

        public Builder signatureRrdatas(@Nullable Input<List<String>> signatureRrdatas) {
            this.signatureRrdatas = signatureRrdatas;
            return this;
        }

        public Builder signatureRrdatas(@Nullable List<String> signatureRrdatas) {
            this.signatureRrdatas = Input.ofNullable(signatureRrdatas);
            return this;
        }
        public RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs build() {
            return new RRSetRoutingPolicyGeoPolicyGeoPolicyItemArgs(kind, location, rrdatas, signatureRrdatas);
        }
    }
}
