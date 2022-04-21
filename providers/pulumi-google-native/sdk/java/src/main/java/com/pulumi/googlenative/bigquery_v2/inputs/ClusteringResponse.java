// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ClusteringResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusteringResponse Empty = new ClusteringResponse();

    /**
     * [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
     * 
     */
    @Import(name="fields", required=true)
    private List<String> fields;

    public List<String> fields() {
        return this.fields;
    }

    private ClusteringResponse() {}

    private ClusteringResponse(ClusteringResponse $) {
        this.fields = $.fields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusteringResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusteringResponse $;

        public Builder() {
            $ = new ClusteringResponse();
        }

        public Builder(ClusteringResponse defaults) {
            $ = new ClusteringResponse(Objects.requireNonNull(defaults));
        }

        public Builder fields(List<String> fields) {
            $.fields = fields;
            return this;
        }

        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        public ClusteringResponse build() {
            $.fields = Objects.requireNonNull($.fields, "expected parameter 'fields' to be non-null");
            return $;
        }
    }

}
