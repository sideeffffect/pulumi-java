// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery.v2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ClusteringArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClusteringArgs Empty = new ClusteringArgs();

    /**
     * [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
     * 
     */
    @Import(name="fields")
    private @Nullable Output<List<String>> fields;

    /**
     * @return [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
     * 
     */
    public Optional<Output<List<String>>> fields() {
        return Optional.ofNullable(this.fields);
    }

    private ClusteringArgs() {}

    private ClusteringArgs(ClusteringArgs $) {
        this.fields = $.fields;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusteringArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusteringArgs $;

        public Builder() {
            $ = new ClusteringArgs();
        }

        public Builder(ClusteringArgs defaults) {
            $ = new ClusteringArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param fields [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
         * 
         * @return builder
         * 
         */
        public Builder fields(@Nullable Output<List<String>> fields) {
            $.fields = fields;
            return this;
        }

        /**
         * @param fields [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
         * 
         * @return builder
         * 
         */
        public Builder fields(List<String> fields) {
            return fields(Output.of(fields));
        }

        /**
         * @param fields [Repeated] One or more fields on which data should be clustered. Only top-level, non-repeated, simple-type fields are supported. When you cluster a table using multiple columns, the order of columns you specify is important. The order of the specified columns determines the sort order of the data.
         * 
         * @return builder
         * 
         */
        public Builder fields(String... fields) {
            return fields(List.of(fields));
        }

        public ClusteringArgs build() {
            return $;
        }
    }

}
