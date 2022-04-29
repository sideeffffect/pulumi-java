// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.inputs;

import com.pulumi.awsnative.kendra.inputs.DataSourceConfluenceSpaceToIndexFieldMappingArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceSpaceConfigurationArgs extends ResourceArgs {

    public static final DataSourceConfluenceSpaceConfigurationArgs Empty = new DataSourceConfluenceSpaceConfigurationArgs();

    @Import(name="crawlArchivedSpaces")
    private @Nullable Output<Boolean> crawlArchivedSpaces;

    public Optional<Output<Boolean>> crawlArchivedSpaces() {
        return Optional.ofNullable(this.crawlArchivedSpaces);
    }

    @Import(name="crawlPersonalSpaces")
    private @Nullable Output<Boolean> crawlPersonalSpaces;

    public Optional<Output<Boolean>> crawlPersonalSpaces() {
        return Optional.ofNullable(this.crawlPersonalSpaces);
    }

    @Import(name="excludeSpaces")
    private @Nullable Output<List<String>> excludeSpaces;

    public Optional<Output<List<String>>> excludeSpaces() {
        return Optional.ofNullable(this.excludeSpaces);
    }

    @Import(name="includeSpaces")
    private @Nullable Output<List<String>> includeSpaces;

    public Optional<Output<List<String>>> includeSpaces() {
        return Optional.ofNullable(this.includeSpaces);
    }

    @Import(name="spaceFieldMappings")
    private @Nullable Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> spaceFieldMappings;

    public Optional<Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>>> spaceFieldMappings() {
        return Optional.ofNullable(this.spaceFieldMappings);
    }

    private DataSourceConfluenceSpaceConfigurationArgs() {}

    private DataSourceConfluenceSpaceConfigurationArgs(DataSourceConfluenceSpaceConfigurationArgs $) {
        this.crawlArchivedSpaces = $.crawlArchivedSpaces;
        this.crawlPersonalSpaces = $.crawlPersonalSpaces;
        this.excludeSpaces = $.excludeSpaces;
        this.includeSpaces = $.includeSpaces;
        this.spaceFieldMappings = $.spaceFieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataSourceConfluenceSpaceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluenceSpaceConfigurationArgs $;

        public Builder() {
            $ = new DataSourceConfluenceSpaceConfigurationArgs();
        }

        public Builder(DataSourceConfluenceSpaceConfigurationArgs defaults) {
            $ = new DataSourceConfluenceSpaceConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder crawlArchivedSpaces(@Nullable Output<Boolean> crawlArchivedSpaces) {
            $.crawlArchivedSpaces = crawlArchivedSpaces;
            return this;
        }

        public Builder crawlArchivedSpaces(Boolean crawlArchivedSpaces) {
            return crawlArchivedSpaces(Output.of(crawlArchivedSpaces));
        }

        public Builder crawlPersonalSpaces(@Nullable Output<Boolean> crawlPersonalSpaces) {
            $.crawlPersonalSpaces = crawlPersonalSpaces;
            return this;
        }

        public Builder crawlPersonalSpaces(Boolean crawlPersonalSpaces) {
            return crawlPersonalSpaces(Output.of(crawlPersonalSpaces));
        }

        public Builder excludeSpaces(@Nullable Output<List<String>> excludeSpaces) {
            $.excludeSpaces = excludeSpaces;
            return this;
        }

        public Builder excludeSpaces(List<String> excludeSpaces) {
            return excludeSpaces(Output.of(excludeSpaces));
        }

        public Builder excludeSpaces(String... excludeSpaces) {
            return excludeSpaces(List.of(excludeSpaces));
        }

        public Builder includeSpaces(@Nullable Output<List<String>> includeSpaces) {
            $.includeSpaces = includeSpaces;
            return this;
        }

        public Builder includeSpaces(List<String> includeSpaces) {
            return includeSpaces(Output.of(includeSpaces));
        }

        public Builder includeSpaces(String... includeSpaces) {
            return includeSpaces(List.of(includeSpaces));
        }

        public Builder spaceFieldMappings(@Nullable Output<List<DataSourceConfluenceSpaceToIndexFieldMappingArgs>> spaceFieldMappings) {
            $.spaceFieldMappings = spaceFieldMappings;
            return this;
        }

        public Builder spaceFieldMappings(List<DataSourceConfluenceSpaceToIndexFieldMappingArgs> spaceFieldMappings) {
            return spaceFieldMappings(Output.of(spaceFieldMappings));
        }

        public Builder spaceFieldMappings(DataSourceConfluenceSpaceToIndexFieldMappingArgs... spaceFieldMappings) {
            return spaceFieldMappings(List.of(spaceFieldMappings));
        }

        public DataSourceConfluenceSpaceConfigurationArgs build() {
            return $;
        }
    }

}
