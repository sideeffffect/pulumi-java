// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceParametersAmazonElasticsearch {
    /**
     * The OpenSearch domain.
     * 
     */
    private final String domain;

    @OutputCustomType.Constructor({"domain"})
    private DataSourceParametersAmazonElasticsearch(String domain) {
        this.domain = domain;
    }

    /**
     * The OpenSearch domain.
     * 
    */
    public String getDomain() {
        return this.domain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAmazonElasticsearch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domain;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAmazonElasticsearch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domain = defaults.domain;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public DataSourceParametersAmazonElasticsearch build() {
            return new DataSourceParametersAmazonElasticsearch(domain);
        }
    }
}
