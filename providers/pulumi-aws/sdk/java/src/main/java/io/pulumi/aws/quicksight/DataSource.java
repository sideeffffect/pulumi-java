// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.quicksight.DataSourceArgs;
import io.pulumi.aws.quicksight.inputs.DataSourceState;
import io.pulumi.aws.quicksight.outputs.DataSourceCredentials;
import io.pulumi.aws.quicksight.outputs.DataSourceParameters;
import io.pulumi.aws.quicksight.outputs.DataSourcePermission;
import io.pulumi.aws.quicksight.outputs.DataSourceSslProperties;
import io.pulumi.aws.quicksight.outputs.DataSourceVpcConnectionProperties;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Resource for managing QuickSight Data Source
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * A QuickSight data source can be imported using the AWS account ID, and data source ID name separated by a slash (`/`) e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:quicksight/dataSource:DataSource example 123456789123/my-data-source-id
 * ```
 * 
 */
@ResourceType(type="aws:quicksight/dataSource:DataSource")
public class DataSource extends io.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the data source
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the data source
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    /**
     * @return The ID for the AWS account that the data source is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
     * 
     */
    @Export(name="credentials", type=DataSourceCredentials.class, parameters={})
    private Output</* @Nullable */ DataSourceCredentials> credentials;

    /**
     * @return The credentials Amazon QuickSight uses to connect to your underlying source. Currently, only credentials based on user name and password are supported. See Credentials below for more details.
     * 
     */
    public Output</* @Nullable */ DataSourceCredentials> credentials() {
        return this.credentials;
    }
    /**
     * An identifier for the data source.
     * 
     */
    @Export(name="dataSourceId", type=String.class, parameters={})
    private Output<String> dataSourceId;

    /**
     * @return An identifier for the data source.
     * 
     */
    public Output<String> dataSourceId() {
        return this.dataSourceId;
    }
    /**
     * A name for the data source, maximum of 128 characters.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return A name for the data source, maximum of 128 characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The parameters used to connect to this data source (exactly one).
     * 
     */
    @Export(name="parameters", type=DataSourceParameters.class, parameters={})
    private Output<DataSourceParameters> parameters;

    /**
     * @return The parameters used to connect to this data source (exactly one).
     * 
     */
    public Output<DataSourceParameters> parameters() {
        return this.parameters;
    }
    /**
     * A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
     * 
     */
    @Export(name="permissions", type=List.class, parameters={DataSourcePermission.class})
    private Output</* @Nullable */ List<DataSourcePermission>> permissions;

    /**
     * @return A set of resource permissions on the data source. Maximum of 64 items. See Permission below for more details.
     * 
     */
    public Output</* @Nullable */ List<DataSourcePermission>> permissions() {
        return this.permissions;
    }
    /**
     * Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
     * 
     */
    @Export(name="sslProperties", type=DataSourceSslProperties.class, parameters={})
    private Output</* @Nullable */ DataSourceSslProperties> sslProperties;

    /**
     * @return Secure Socket Layer (SSL) properties that apply when Amazon QuickSight connects to your underlying source. See SSL Properties below for more details.
     * 
     */
    public Output</* @Nullable */ DataSourceSslProperties> sslProperties() {
        return this.sslProperties;
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the data source. See the [AWS Documentation](https://docs.aws.amazon.com/quicksight/latest/APIReference/API_CreateDataSource.html#QS-CreateDataSource-request-Type) for the complete list of valid values.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
     * 
     */
    @Export(name="vpcConnectionProperties", type=DataSourceVpcConnectionProperties.class, parameters={})
    private Output</* @Nullable */ DataSourceVpcConnectionProperties> vpcConnectionProperties;

    /**
     * @return Use this parameter only when you want Amazon QuickSight to use a VPC connection when connecting to your underlying source. See VPC Connection Properties below for more details.
     * 
     */
    public Output</* @Nullable */ DataSourceVpcConnectionProperties> vpcConnectionProperties() {
        return this.vpcConnectionProperties;
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
    public DataSource(String name, DataSourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataSource(String name, DataSourceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/dataSource:DataSource", name, args == null ? DataSourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataSource(String name, Output<String> id, @Nullable DataSourceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/dataSource:DataSource", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static DataSource get(String name, Output<String> id, @Nullable DataSourceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new DataSource(name, id, state, options);
    }
}
