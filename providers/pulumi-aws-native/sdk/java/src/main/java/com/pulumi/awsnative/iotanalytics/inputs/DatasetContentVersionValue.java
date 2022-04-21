// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotanalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetContentVersionValue extends com.pulumi.resources.InvokeArgs {

    public static final DatasetContentVersionValue Empty = new DatasetContentVersionValue();

    @Import(name="datasetName", required=true)
    private String datasetName;

    public String datasetName() {
        return this.datasetName;
    }

    private DatasetContentVersionValue() {}

    private DatasetContentVersionValue(DatasetContentVersionValue $) {
        this.datasetName = $.datasetName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetContentVersionValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetContentVersionValue $;

        public Builder() {
            $ = new DatasetContentVersionValue();
        }

        public Builder(DatasetContentVersionValue defaults) {
            $ = new DatasetContentVersionValue(Objects.requireNonNull(defaults));
        }

        public Builder datasetName(String datasetName) {
            $.datasetName = datasetName;
            return this;
        }

        public DatasetContentVersionValue build() {
            $.datasetName = Objects.requireNonNull($.datasetName, "expected parameter 'datasetName' to be non-null");
            return $;
        }
    }

}
