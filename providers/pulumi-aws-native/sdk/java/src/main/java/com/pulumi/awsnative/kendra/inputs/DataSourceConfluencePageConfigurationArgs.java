// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceConfluencePageToIndexFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluencePageConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceConfluencePageConfigurationArgs Empty = new DataSourceConfluencePageConfigurationArgs();

    @Import(name="pageFieldMappings")
    private @Nullable Output<List<DataSourceConfluencePageToIndexFieldMappingArgs>> pageFieldMappings;

    public Optional<Output<List<DataSourceConfluencePageToIndexFieldMappingArgs>>> pageFieldMappings() {
        return Optional.ofNullable(this.pageFieldMappings);
    }

    private DataSourceConfluencePageConfigurationArgs() {}

    private DataSourceConfluencePageConfigurationArgs(DataSourceConfluencePageConfigurationArgs $) {
        this.pageFieldMappings = $.pageFieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfluencePageConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluencePageConfigurationArgs $;

        public Builder() {
            $ = new DataSourceConfluencePageConfigurationArgs();
        }

        public Builder(DataSourceConfluencePageConfigurationArgs defaults) {
            $ = new DataSourceConfluencePageConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder pageFieldMappings(@Nullable Output<List<DataSourceConfluencePageToIndexFieldMappingArgs>> pageFieldMappings) {
            $.pageFieldMappings = pageFieldMappings;
            return this;
        }

        public Builder pageFieldMappings(List<DataSourceConfluencePageToIndexFieldMappingArgs> pageFieldMappings) {
            return pageFieldMappings(Output.of(pageFieldMappings));
        }

        public Builder pageFieldMappings(DataSourceConfluencePageToIndexFieldMappingArgs... pageFieldMappings) {
            return pageFieldMappings(List.of(pageFieldMappings));
        }

        public DataSourceConfluencePageConfigurationArgs build() {
            return $;
        }
    }

}
