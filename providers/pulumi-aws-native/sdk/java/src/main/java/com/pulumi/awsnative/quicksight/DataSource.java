// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.quicksight;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.quicksight.DataSourceArgs;
import com.pulumi.awsnative.quicksight.enums.DataSourceResourceStatus;
import com.pulumi.awsnative.quicksight.enums.DataSourceType;
import com.pulumi.awsnative.quicksight.outputs.DataSourceCredentials;
import com.pulumi.awsnative.quicksight.outputs.DataSourceErrorInfo;
import com.pulumi.awsnative.quicksight.outputs.DataSourceParameters;
import com.pulumi.awsnative.quicksight.outputs.DataSourceResourcePermission;
import com.pulumi.awsnative.quicksight.outputs.DataSourceSslProperties;
import com.pulumi.awsnative.quicksight.outputs.DataSourceTag;
import com.pulumi.awsnative.quicksight.outputs.DataSourceVpcConnectionProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Definition of the AWS::QuickSight::DataSource Resource Type.
 * 
 */
@ResourceType(type="aws-native:quicksight:DataSource")
public class DataSource extends CustomResource {
    /**
     * &lt;p&gt;A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request
     *             with the structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is null,
     *             the &lt;code&gt;Credentials&lt;/code&gt; originally used with this &lt;code&gt;DataSourceParameters&lt;/code&gt;
     *             are automatically allowed.&lt;/p&gt;
     * 
     */
    @Export(name="alternateDataSourceParameters", type=List.class, parameters={DataSourceParameters.class})
    private Output</* @Nullable */ List<DataSourceParameters>> alternateDataSourceParameters;

    /**
     * @return &lt;p&gt;A set of alternate data source parameters that you want to share for the credentials
     *             stored with this data source. The credentials are applied in tandem with the data source
     *             parameters when you copy a data source by using a create or update request. The API
     *             operation compares the &lt;code&gt;DataSourceParameters&lt;/code&gt; structure that&#39;s in the request
     *             with the structures in the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; allow list. If the
     *             structures are an exact match, the request is allowed to use the credentials from this
     *             existing data source. If the &lt;code&gt;AlternateDataSourceParameters&lt;/code&gt; list is null,
     *             the &lt;code&gt;Credentials&lt;/code&gt; originally used with this &lt;code&gt;DataSourceParameters&lt;/code&gt;
     *             are automatically allowed.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<DataSourceParameters>>> alternateDataSourceParameters() {
        return Codegen.optional(this.alternateDataSourceParameters);
    }
    /**
     * &lt;p&gt;The Amazon Resource Name (ARN) of the data source.&lt;/p&gt;
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return &lt;p&gt;The Amazon Resource Name (ARN) of the data source.&lt;/p&gt;
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output</* @Nullable */ String> awsAccountId;

    public Output<Optional<String>> awsAccountId() {
        return Codegen.optional(this.awsAccountId);
    }
    /**
     * &lt;p&gt;The time that this data source was created.&lt;/p&gt;
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return &lt;p&gt;The time that this data source was created.&lt;/p&gt;
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    @Export(name="credentials", type=DataSourceCredentials.class, parameters={})
    private Output</* @Nullable */ DataSourceCredentials> credentials;

    public Output<Optional<DataSourceCredentials>> credentials() {
        return Codegen.optional(this.credentials);
    }
    @Export(name="dataSourceId", type=String.class, parameters={})
    private Output</* @Nullable */ String> dataSourceId;

    public Output<Optional<String>> dataSourceId() {
        return Codegen.optional(this.dataSourceId);
    }
    @Export(name="dataSourceParameters", type=DataSourceParameters.class, parameters={})
    private Output</* @Nullable */ DataSourceParameters> dataSourceParameters;

    public Output<Optional<DataSourceParameters>> dataSourceParameters() {
        return Codegen.optional(this.dataSourceParameters);
    }
    @Export(name="errorInfo", type=DataSourceErrorInfo.class, parameters={})
    private Output</* @Nullable */ DataSourceErrorInfo> errorInfo;

    public Output<Optional<DataSourceErrorInfo>> errorInfo() {
        return Codegen.optional(this.errorInfo);
    }
    /**
     * &lt;p&gt;The last time that this data source was updated.&lt;/p&gt;
     * 
     */
    @Export(name="lastUpdatedTime", type=String.class, parameters={})
    private Output<String> lastUpdatedTime;

    /**
     * @return &lt;p&gt;The last time that this data source was updated.&lt;/p&gt;
     * 
     */
    public Output<String> lastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    /**
     * &lt;p&gt;A display name for the data source.&lt;/p&gt;
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output</* @Nullable */ String> name;

    /**
     * @return &lt;p&gt;A display name for the data source.&lt;/p&gt;
     * 
     */
    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    /**
     * &lt;p&gt;A list of resource permissions on the data source.&lt;/p&gt;
     * 
     */
    @Export(name="permissions", type=List.class, parameters={DataSourceResourcePermission.class})
    private Output</* @Nullable */ List<DataSourceResourcePermission>> permissions;

    /**
     * @return &lt;p&gt;A list of resource permissions on the data source.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<DataSourceResourcePermission>>> permissions() {
        return Codegen.optional(this.permissions);
    }
    @Export(name="sslProperties", type=DataSourceSslProperties.class, parameters={})
    private Output</* @Nullable */ DataSourceSslProperties> sslProperties;

    public Output<Optional<DataSourceSslProperties>> sslProperties() {
        return Codegen.optional(this.sslProperties);
    }
    @Export(name="status", type=DataSourceResourceStatus.class, parameters={})
    private Output<DataSourceResourceStatus> status;

    public Output<DataSourceResourceStatus> status() {
        return this.status;
    }
    /**
     * &lt;p&gt;Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.&lt;/p&gt;
     * 
     */
    @Export(name="tags", type=List.class, parameters={DataSourceTag.class})
    private Output</* @Nullable */ List<DataSourceTag>> tags;

    /**
     * @return &lt;p&gt;Contains a map of the key-value pairs for the resource tag or tags assigned to the data source.&lt;/p&gt;
     * 
     */
    public Output<Optional<List<DataSourceTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="type", type=DataSourceType.class, parameters={})
    private Output</* @Nullable */ DataSourceType> type;

    public Output<Optional<DataSourceType>> type() {
        return Codegen.optional(this.type);
    }
    @Export(name="vpcConnectionProperties", type=DataSourceVpcConnectionProperties.class, parameters={})
    private Output</* @Nullable */ DataSourceVpcConnectionProperties> vpcConnectionProperties;

    public Output<Optional<DataSourceVpcConnectionProperties>> vpcConnectionProperties() {
        return Codegen.optional(this.vpcConnectionProperties);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataSource(String name) {
        this(name, DataSourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataSource(String name, @Nullable DataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, @Nullable DataSourceArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:quicksight:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSource(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:quicksight:DataSource", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataSource get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new DataSource(name, id, options);
    }
}
