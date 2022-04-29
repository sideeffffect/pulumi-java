// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kendra;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.kendra.FaqArgs;
import com.pulumi.awsnative.kendra.enums.FaqFileFormat;
import com.pulumi.awsnative.kendra.outputs.FaqS3Path;
import com.pulumi.awsnative.kendra.outputs.FaqTag;
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
 * A Kendra FAQ resource
 * 
 */
@ResourceType(type="aws-native:kendra:Faq")
public class Faq extends CustomResource {
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }
    /**
     * FAQ description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return FAQ description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * FAQ file format
     * 
     */
    @Export(name="fileFormat", type=FaqFileFormat.class, parameters={})
    private Output</* @Nullable */ FaqFileFormat> fileFormat;

    /**
     * @return FAQ file format
     * 
     */
    public Output<Optional<FaqFileFormat>> fileFormat() {
        return Codegen.optional(this.fileFormat);
    }
    /**
     * Index ID
     * 
     */
    @Export(name="indexId", type=String.class, parameters={})
    private Output<String> indexId;

    /**
     * @return Index ID
     * 
     */
    public Output<String> indexId() {
        return this.indexId;
    }
    /**
     * FAQ name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return FAQ name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * FAQ role ARN
     * 
     */
    @Export(name="roleArn", type=String.class, parameters={})
    private Output<String> roleArn;

    /**
     * @return FAQ role ARN
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * FAQ S3 path
     * 
     */
    @Export(name="s3Path", type=FaqS3Path.class, parameters={})
    private Output<FaqS3Path> s3Path;

    /**
     * @return FAQ S3 path
     * 
     */
    public Output<FaqS3Path> s3Path() {
        return this.s3Path;
    }
    /**
     * Tags for labeling the FAQ
     * 
     */
    @Export(name="tags", type=List.class, parameters={FaqTag.class})
    private Output</* @Nullable */ List<FaqTag>> tags;

    /**
     * @return Tags for labeling the FAQ
     * 
     */
    public Output<Optional<List<FaqTag>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Faq(String name) {
        this(name, FaqArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Faq(String name, FaqArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Faq(String name, FaqArgs args, @Nullable CustomResourceOptions options) {
        super("aws-native:kendra:Faq", name, args == null ? FaqArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Faq(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("aws-native:kendra:Faq", name, null, makeResourceOptions(options, id));
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
    public static Faq get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Faq(name, id, options);
    }
}
