// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.datacatalog;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.datacatalog.TagTemplateIamPolicyArgs;
import com.pulumi.gcp.datacatalog.inputs.TagTemplateIamPolicyState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy")
public class TagTemplateIamPolicy extends CustomResource {
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    public Output<String> etag() {
        return this.etag;
    }
    @Export(name="policyData", type=String.class, parameters={})
    private Output<String> policyData;

    public Output<String> policyData() {
        return this.policyData;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    @Export(name="region", type=String.class, parameters={})
    private Output<String> region;

    public Output<String> region() {
        return this.region;
    }
    @Export(name="tagTemplate", type=String.class, parameters={})
    private Output<String> tagTemplate;

    public Output<String> tagTemplate() {
        return this.tagTemplate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TagTemplateIamPolicy(String name) {
        this(name, TagTemplateIamPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TagTemplateIamPolicy(String name, TagTemplateIamPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TagTemplateIamPolicy(String name, TagTemplateIamPolicyArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy", name, args == null ? TagTemplateIamPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TagTemplateIamPolicy(String name, Output<String> id, @Nullable TagTemplateIamPolicyState state, @Nullable CustomResourceOptions options) {
        super("gcp:datacatalog/tagTemplateIamPolicy:TagTemplateIamPolicy", name, state, makeResourceOptions(options, id));
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
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TagTemplateIamPolicy get(String name, Output<String> id, @Nullable TagTemplateIamPolicyState state, @Nullable CustomResourceOptions options) {
        return new TagTemplateIamPolicy(name, id, state, options);
    }
}
