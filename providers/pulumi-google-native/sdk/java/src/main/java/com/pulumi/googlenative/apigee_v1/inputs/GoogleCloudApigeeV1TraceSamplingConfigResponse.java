// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigee_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * TraceSamplingConfig represents the detail settings of distributed tracing. Only the fields that are defined in the distributed trace configuration can be overridden using the distribute trace configuration override APIs.
 * 
 */
public final class GoogleCloudApigeeV1TraceSamplingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudApigeeV1TraceSamplingConfigResponse Empty = new GoogleCloudApigeeV1TraceSamplingConfigResponse();

    /**
     * Sampler of distributed tracing. OFF is the default value.
     * 
     */
    @Import(name="sampler", required=true)
    private String sampler;

    public String sampler() {
        return this.sampler;
    }

    /**
     * Field sampling rate. This value is only applicable when using the PROBABILITY sampler. The supported values are &gt; 0 and &lt;= 0.5.
     * 
     */
    @Import(name="samplingRate", required=true)
    private Double samplingRate;

    public Double samplingRate() {
        return this.samplingRate;
    }

    private GoogleCloudApigeeV1TraceSamplingConfigResponse() {}

    private GoogleCloudApigeeV1TraceSamplingConfigResponse(GoogleCloudApigeeV1TraceSamplingConfigResponse $) {
        this.sampler = $.sampler;
        this.samplingRate = $.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudApigeeV1TraceSamplingConfigResponse $;

        public Builder() {
            $ = new GoogleCloudApigeeV1TraceSamplingConfigResponse();
        }

        public Builder(GoogleCloudApigeeV1TraceSamplingConfigResponse defaults) {
            $ = new GoogleCloudApigeeV1TraceSamplingConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder sampler(String sampler) {
            $.sampler = sampler;
            return this;
        }

        public Builder samplingRate(Double samplingRate) {
            $.samplingRate = samplingRate;
            return this;
        }

        public GoogleCloudApigeeV1TraceSamplingConfigResponse build() {
            $.sampler = Objects.requireNonNull($.sampler, "expected parameter 'sampler' to be non-null");
            $.samplingRate = Objects.requireNonNull($.samplingRate, "expected parameter 'samplingRate' to be non-null");
            return $;
        }
    }

}
