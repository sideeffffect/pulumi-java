// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.datacatalog_v1.outputs.GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse {
    /**
     * Fields specific to BigQuery connections.
     * 
     */
    private final GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec;

    @OutputCustomType.Constructor
    private GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse(@OutputCustomType.Parameter("bigqueryConnectionSpec") GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec) {
        this.bigqueryConnectionSpec = bigqueryConnectionSpec;
    }

    /**
     * Fields specific to BigQuery connections.
     * 
    */
    public GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse getBigqueryConnectionSpec() {
        return this.bigqueryConnectionSpec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryConnectionSpec = defaults.bigqueryConnectionSpec;
        }

        public Builder bigqueryConnectionSpec(GoogleCloudDatacatalogV1BigQueryConnectionSpecResponse bigqueryConnectionSpec) {
            this.bigqueryConnectionSpec = Objects.requireNonNull(bigqueryConnectionSpec);
            return this;
        }
        public GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse build() {
            return new GoogleCloudDatacatalogV1DataSourceConnectionSpecResponse(bigqueryConnectionSpec);
        }
    }
}
