// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.toolresults_v1beta3.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Encapsulates the metadata for basic sample series represented by a line chart
 * 
 */
public final class BasicPerfSampleSeriesResponse extends com.pulumi.resources.InvokeArgs {

    public static final BasicPerfSampleSeriesResponse Empty = new BasicPerfSampleSeriesResponse();

    @Import(name="perfMetricType", required=true)
    private String perfMetricType;

    public String perfMetricType() {
        return this.perfMetricType;
    }

    @Import(name="perfUnit", required=true)
    private String perfUnit;

    public String perfUnit() {
        return this.perfUnit;
    }

    @Import(name="sampleSeriesLabel", required=true)
    private String sampleSeriesLabel;

    public String sampleSeriesLabel() {
        return this.sampleSeriesLabel;
    }

    private BasicPerfSampleSeriesResponse() {}

    private BasicPerfSampleSeriesResponse(BasicPerfSampleSeriesResponse $) {
        this.perfMetricType = $.perfMetricType;
        this.perfUnit = $.perfUnit;
        this.sampleSeriesLabel = $.sampleSeriesLabel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BasicPerfSampleSeriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BasicPerfSampleSeriesResponse $;

        public Builder() {
            $ = new BasicPerfSampleSeriesResponse();
        }

        public Builder(BasicPerfSampleSeriesResponse defaults) {
            $ = new BasicPerfSampleSeriesResponse(Objects.requireNonNull(defaults));
        }

        public Builder perfMetricType(String perfMetricType) {
            $.perfMetricType = perfMetricType;
            return this;
        }

        public Builder perfUnit(String perfUnit) {
            $.perfUnit = perfUnit;
            return this;
        }

        public Builder sampleSeriesLabel(String sampleSeriesLabel) {
            $.sampleSeriesLabel = sampleSeriesLabel;
            return this;
        }

        public BasicPerfSampleSeriesResponse build() {
            $.perfMetricType = Objects.requireNonNull($.perfMetricType, "expected parameter 'perfMetricType' to be non-null");
            $.perfUnit = Objects.requireNonNull($.perfUnit, "expected parameter 'perfUnit' to be non-null");
            $.sampleSeriesLabel = Objects.requireNonNull($.sampleSeriesLabel, "expected parameter 'sampleSeriesLabel' to be non-null");
            return $;
        }
    }

}
