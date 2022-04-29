// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.athena.PreparedStatementArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource schema for AWS::Athena::PreparedStatement
 * 
 */
@ResourceType(type="aws-native:athena:PreparedStatement")
public class PreparedStatement extends CustomResource {
    /**
     * The description of the prepared statement.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the prepared statement.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The query string for the prepared statement.
     * 
     */
    @Export(name="queryStatement", type=String.class, parameters={})
    private Output<String> queryStatement;

    /**
     * @return The query string for the prepared statement.
     * 
     */
    public Output<String> queryStatement() {
        return this.queryStatement;
    }
    /**
     * The name of the prepared statement.
     * 
     */
    @Export(name="statementName", type=String.class, parameters={})
    private Output<String> statementName;

    /**
     * @return The name of the prepared statement.
     * 
     */
    public Output<String> statementName() {
        return this.statementName;
    }
    /**
     * The name of the workgroup to which the prepared statement belongs.
     * 
     */
    @Export(name="workGroup", type=String.class, parameters={})
    private Output<String> workGroup;

    /**
     * @return The name of the workgroup to which the prepared statement belongs.
     * 
     */
    public Output<String> workGroup() {
        return this.workGroup;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PreparedStatement(String name) {
        this(name, PreparedStatementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PreparedStatement(String name, PreparedStatementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PreparedStatement(String name, PreparedStatementArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:athena:PreparedStatement", name, args == null ? PreparedStatementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PreparedStatement(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:athena:PreparedStatement", name, null, makeResourceOptions(options, id));
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
    public static PreparedStatement get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new PreparedStatement(name, id, options);
    }
}
