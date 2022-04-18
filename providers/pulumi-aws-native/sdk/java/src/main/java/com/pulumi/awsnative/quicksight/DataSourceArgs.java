// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight;

import com.pulumi.awsnative.quicksight.enums.DataSourceType;
import com.pulumi.awsnative.quicksight.inputs.DataSourceCredentialsArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSourceErrorInfoArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSourceParametersArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSourceResourcePermissionArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSourceSslPropertiesArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSourceTagArgs;
import com.pulumi.awsnative.quicksight.inputs.DataSourceVpcConnectionPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * <p>A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the <code>DataSourceParameters</code> structure that's in the request
     *             with the structures in the <code>AlternateDataSourceParameters</code> allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the <code>AlternateDataSourceParameters</code> list is null,
     *             the <code>Credentials</code> originally used with this <code>DataSourceParameters</code>
     *             are automatically allowed.</p>
     * 
     */
    @Import(name="alternateDataSourceParameters")
      private final @Nullable Output<List<DataSourceParametersArgs>> alternateDataSourceParameters;

    public Output<List<DataSourceParametersArgs>> alternateDataSourceParameters() {
        return this.alternateDataSourceParameters == null ? Codegen.empty() : this.alternateDataSourceParameters;
    }

    @Import(name="awsAccountId")
      private final @Nullable Output<String> awsAccountId;

    public Output<String> awsAccountId() {
        return this.awsAccountId == null ? Codegen.empty() : this.awsAccountId;
    }

    @Import(name="credentials")
      private final @Nullable Output<DataSourceCredentialsArgs> credentials;

    public Output<DataSourceCredentialsArgs> credentials() {
        return this.credentials == null ? Codegen.empty() : this.credentials;
    }

    @Import(name="dataSourceId")
      private final @Nullable Output<String> dataSourceId;

    public Output<String> dataSourceId() {
        return this.dataSourceId == null ? Codegen.empty() : this.dataSourceId;
    }

    @Import(name="dataSourceParameters")
      private final @Nullable Output<DataSourceParametersArgs> dataSourceParameters;

    public Output<DataSourceParametersArgs> dataSourceParameters() {
        return this.dataSourceParameters == null ? Codegen.empty() : this.dataSourceParameters;
    }

    @Import(name="errorInfo")
      private final @Nullable Output<DataSourceErrorInfoArgs> errorInfo;

    public Output<DataSourceErrorInfoArgs> errorInfo() {
        return this.errorInfo == null ? Codegen.empty() : this.errorInfo;
    }

    /**
     * <p>A display name for the data source.</p>
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * <p>A list of resource permissions on the data source.</p>
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<DataSourceResourcePermissionArgs>> permissions;

    public Output<List<DataSourceResourcePermissionArgs>> permissions() {
        return this.permissions == null ? Codegen.empty() : this.permissions;
    }

    @Import(name="sslProperties")
      private final @Nullable Output<DataSourceSslPropertiesArgs> sslProperties;

    public Output<DataSourceSslPropertiesArgs> sslProperties() {
        return this.sslProperties == null ? Codegen.empty() : this.sslProperties;
    }

    /**
     * <p>Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.</p>
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<DataSourceTagArgs>> tags;

    public Output<List<DataSourceTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="type")
      private final @Nullable Output<DataSourceType> type;

    public Output<DataSourceType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    @Import(name="vpcConnectionProperties")
      private final @Nullable Output<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties;

    public Output<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties() {
        return this.vpcConnectionProperties == null ? Codegen.empty() : this.vpcConnectionProperties;
    }

    public DataSourceArgs(
        @Nullable Output<List<DataSourceParametersArgs>> alternateDataSourceParameters,
        @Nullable Output<String> awsAccountId,
        @Nullable Output<DataSourceCredentialsArgs> credentials,
        @Nullable Output<String> dataSourceId,
        @Nullable Output<DataSourceParametersArgs> dataSourceParameters,
        @Nullable Output<DataSourceErrorInfoArgs> errorInfo,
        @Nullable Output<String> name,
        @Nullable Output<List<DataSourceResourcePermissionArgs>> permissions,
        @Nullable Output<DataSourceSslPropertiesArgs> sslProperties,
        @Nullable Output<List<DataSourceTagArgs>> tags,
        @Nullable Output<DataSourceType> type,
        @Nullable Output<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties) {
        this.alternateDataSourceParameters = alternateDataSourceParameters;
        this.awsAccountId = awsAccountId;
        this.credentials = credentials;
        this.dataSourceId = dataSourceId;
        this.dataSourceParameters = dataSourceParameters;
        this.errorInfo = errorInfo;
        this.name = name;
        this.permissions = permissions;
        this.sslProperties = sslProperties;
        this.tags = tags;
        this.type = type;
        this.vpcConnectionProperties = vpcConnectionProperties;
    }

    private DataSourceArgs() {
        this.alternateDataSourceParameters = Codegen.empty();
        this.awsAccountId = Codegen.empty();
        this.credentials = Codegen.empty();
        this.dataSourceId = Codegen.empty();
        this.dataSourceParameters = Codegen.empty();
        this.errorInfo = Codegen.empty();
        this.name = Codegen.empty();
        this.permissions = Codegen.empty();
        this.sslProperties = Codegen.empty();
        this.tags = Codegen.empty();
        this.type = Codegen.empty();
        this.vpcConnectionProperties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<DataSourceParametersArgs>> alternateDataSourceParameters;
        private @Nullable Output<String> awsAccountId;
        private @Nullable Output<DataSourceCredentialsArgs> credentials;
        private @Nullable Output<String> dataSourceId;
        private @Nullable Output<DataSourceParametersArgs> dataSourceParameters;
        private @Nullable Output<DataSourceErrorInfoArgs> errorInfo;
        private @Nullable Output<String> name;
        private @Nullable Output<List<DataSourceResourcePermissionArgs>> permissions;
        private @Nullable Output<DataSourceSslPropertiesArgs> sslProperties;
        private @Nullable Output<List<DataSourceTagArgs>> tags;
        private @Nullable Output<DataSourceType> type;
        private @Nullable Output<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateDataSourceParameters = defaults.alternateDataSourceParameters;
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.credentials = defaults.credentials;
    	      this.dataSourceId = defaults.dataSourceId;
    	      this.dataSourceParameters = defaults.dataSourceParameters;
    	      this.errorInfo = defaults.errorInfo;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.sslProperties = defaults.sslProperties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.vpcConnectionProperties = defaults.vpcConnectionProperties;
        }

        public Builder alternateDataSourceParameters(@Nullable Output<List<DataSourceParametersArgs>> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = alternateDataSourceParameters;
            return this;
        }
        public Builder alternateDataSourceParameters(@Nullable List<DataSourceParametersArgs> alternateDataSourceParameters) {
            this.alternateDataSourceParameters = Codegen.ofNullable(alternateDataSourceParameters);
            return this;
        }
        public Builder alternateDataSourceParameters(DataSourceParametersArgs... alternateDataSourceParameters) {
            return alternateDataSourceParameters(List.of(alternateDataSourceParameters));
        }
        public Builder awsAccountId(@Nullable Output<String> awsAccountId) {
            this.awsAccountId = awsAccountId;
            return this;
        }
        public Builder awsAccountId(@Nullable String awsAccountId) {
            this.awsAccountId = Codegen.ofNullable(awsAccountId);
            return this;
        }
        public Builder credentials(@Nullable Output<DataSourceCredentialsArgs> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable DataSourceCredentialsArgs credentials) {
            this.credentials = Codegen.ofNullable(credentials);
            return this;
        }
        public Builder dataSourceId(@Nullable Output<String> dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public Builder dataSourceId(@Nullable String dataSourceId) {
            this.dataSourceId = Codegen.ofNullable(dataSourceId);
            return this;
        }
        public Builder dataSourceParameters(@Nullable Output<DataSourceParametersArgs> dataSourceParameters) {
            this.dataSourceParameters = dataSourceParameters;
            return this;
        }
        public Builder dataSourceParameters(@Nullable DataSourceParametersArgs dataSourceParameters) {
            this.dataSourceParameters = Codegen.ofNullable(dataSourceParameters);
            return this;
        }
        public Builder errorInfo(@Nullable Output<DataSourceErrorInfoArgs> errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public Builder errorInfo(@Nullable DataSourceErrorInfoArgs errorInfo) {
            this.errorInfo = Codegen.ofNullable(errorInfo);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder permissions(@Nullable Output<List<DataSourceResourcePermissionArgs>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<DataSourceResourcePermissionArgs> permissions) {
            this.permissions = Codegen.ofNullable(permissions);
            return this;
        }
        public Builder permissions(DataSourceResourcePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder sslProperties(@Nullable Output<DataSourceSslPropertiesArgs> sslProperties) {
            this.sslProperties = sslProperties;
            return this;
        }
        public Builder sslProperties(@Nullable DataSourceSslPropertiesArgs sslProperties) {
            this.sslProperties = Codegen.ofNullable(sslProperties);
            return this;
        }
        public Builder tags(@Nullable Output<List<DataSourceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<DataSourceTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(DataSourceTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder type(@Nullable Output<DataSourceType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable DataSourceType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder vpcConnectionProperties(@Nullable Output<DataSourceVpcConnectionPropertiesArgs> vpcConnectionProperties) {
            this.vpcConnectionProperties = vpcConnectionProperties;
            return this;
        }
        public Builder vpcConnectionProperties(@Nullable DataSourceVpcConnectionPropertiesArgs vpcConnectionProperties) {
            this.vpcConnectionProperties = Codegen.ofNullable(vpcConnectionProperties);
            return this;
        }        public DataSourceArgs build() {
            return new DataSourceArgs(alternateDataSourceParameters, awsAccountId, credentials, dataSourceId, dataSourceParameters, errorInfo, name, permissions, sslProperties, tags, type, vpcConnectionProperties);
        }
    }
}
