// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceConfluencePageToIndexFieldMapping;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluencePageConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluencePageConfiguration Empty = new DataSourceConfluencePageConfiguration();

    @InputImport(name="pageFieldMappings")
      private final @Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings;

    public List<DataSourceConfluencePageToIndexFieldMapping> getPageFieldMappings() {
        return this.pageFieldMappings == null ? List.of() : this.pageFieldMappings;
    }

    public DataSourceConfluencePageConfiguration(@Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings) {
        this.pageFieldMappings = pageFieldMappings;
    }

    private DataSourceConfluencePageConfiguration() {
        this.pageFieldMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluencePageConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluencePageConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pageFieldMappings = defaults.pageFieldMappings;
        }

        public Builder pageFieldMappings(@Nullable List<DataSourceConfluencePageToIndexFieldMapping> pageFieldMappings) {
            this.pageFieldMappings = pageFieldMappings;
            return this;
        }
        public DataSourceConfluencePageConfiguration build() {
            return new DataSourceConfluencePageConfiguration(pageFieldMappings);
        }
    }
}
