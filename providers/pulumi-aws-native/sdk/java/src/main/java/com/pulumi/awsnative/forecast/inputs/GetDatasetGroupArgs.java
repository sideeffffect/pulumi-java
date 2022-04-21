// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.forecast.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDatasetGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDatasetGroupArgs Empty = new GetDatasetGroupArgs();

    /**
     * The Amazon Resource Name (ARN) of the dataset group to delete.
     * 
     */
    @Import(name="datasetGroupArn", required=true)
    private String datasetGroupArn;

    public String datasetGroupArn() {
        return this.datasetGroupArn;
    }

    private GetDatasetGroupArgs() {}

    private GetDatasetGroupArgs(GetDatasetGroupArgs $) {
        this.datasetGroupArn = $.datasetGroupArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDatasetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDatasetGroupArgs $;

        public Builder() {
            $ = new GetDatasetGroupArgs();
        }

        public Builder(GetDatasetGroupArgs defaults) {
            $ = new GetDatasetGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetGroupArn(String datasetGroupArn) {
            $.datasetGroupArn = datasetGroupArn;
            return this;
        }

        public GetDatasetGroupArgs build() {
            $.datasetGroupArn = Objects.requireNonNull($.datasetGroupArn, "expected parameter 'datasetGroupArn' to be non-null");
            return $;
        }
    }

}
