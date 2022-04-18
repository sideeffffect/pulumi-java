// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra.outputs;

import com.pulumi.awsnative.kendra.outputs.DataSourceConfiguration;
import com.pulumi.awsnative.kendra.outputs.DataSourceTag;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDataSourceResult {
    private final @Nullable String arn;
    private final @Nullable DataSourceConfiguration dataSourceConfiguration;
    private final @Nullable String description;
    private final @Nullable String id;
    private final @Nullable String indexId;
    private final @Nullable String name;
    private final @Nullable String roleArn;
    private final @Nullable String schedule;
    /**
     * Tags for labeling the data source
     * 
     */
    private final @Nullable List<DataSourceTag> tags;

    @CustomType.Constructor
    private GetDataSourceResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("dataSourceConfiguration") @Nullable DataSourceConfiguration dataSourceConfiguration,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("indexId") @Nullable String indexId,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("roleArn") @Nullable String roleArn,
        @CustomType.Parameter("schedule") @Nullable String schedule,
        @CustomType.Parameter("tags") @Nullable List<DataSourceTag> tags) {
        this.arn = arn;
        this.dataSourceConfiguration = dataSourceConfiguration;
        this.description = description;
        this.id = id;
        this.indexId = indexId;
        this.name = name;
        this.roleArn = roleArn;
        this.schedule = schedule;
        this.tags = tags;
    }

    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<DataSourceConfiguration> dataSourceConfiguration() {
        return Optional.ofNullable(this.dataSourceConfiguration);
    }
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> indexId() {
        return Optional.ofNullable(this.indexId);
    }
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<String> schedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * Tags for labeling the data source
     * 
    */
    public List<DataSourceTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable DataSourceConfiguration dataSourceConfiguration;
        private @Nullable String description;
        private @Nullable String id;
        private @Nullable String indexId;
        private @Nullable String name;
        private @Nullable String roleArn;
        private @Nullable String schedule;
        private @Nullable List<DataSourceTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.dataSourceConfiguration = defaults.dataSourceConfiguration;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.indexId = defaults.indexId;
    	      this.name = defaults.name;
    	      this.roleArn = defaults.roleArn;
    	      this.schedule = defaults.schedule;
    	      this.tags = defaults.tags;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder dataSourceConfiguration(@Nullable DataSourceConfiguration dataSourceConfiguration) {
            this.dataSourceConfiguration = dataSourceConfiguration;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder indexId(@Nullable String indexId) {
            this.indexId = indexId;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder schedule(@Nullable String schedule) {
            this.schedule = schedule;
            return this;
        }
        public Builder tags(@Nullable List<DataSourceTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DataSourceTag... tags) {
            return tags(List.of(tags));
        }        public GetDataSourceResult build() {
            return new GetDataSourceResult(arn, dataSourceConfiguration, description, id, indexId, name, roleArn, schedule, tags);
        }
    }
}
