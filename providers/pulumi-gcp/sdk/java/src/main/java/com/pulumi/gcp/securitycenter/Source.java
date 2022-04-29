// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.securitycenter;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.securitycenter.SourceArgs;
import com.pulumi.gcp.securitycenter.inputs.SourceState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A Cloud Security Command Center&#39;s (Cloud SCC) finding source. A finding
 * source is an entity or a mechanism that can produce a finding. A source is
 * like a container of findings that come from the same scanner, logger,
 * monitor, etc.
 * 
 * To get more information about Source, see:
 * 
 * * [API documentation](https://cloud.google.com/security-command-center/docs/reference/rest/v1beta1/organizations.sources)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/security-command-center/docs)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Source can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:securitycenter/source:Source default organizations/{{organization}}/sources/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:securitycenter/source:Source default {{organization}}/{{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:securitycenter/source:Source")
public class Source extends CustomResource {
    /**
     * The description of the source (max of 1024 characters).
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the source (max of 1024 characters).
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The source’s display name. A source’s display name must be unique
     * amongst its siblings, for example, two sources with the same parent
     * can&#39;t share the same display name. The display name must start and end
     * with a letter or digit, may contain letters, digits, spaces, hyphens,
     * and underscores, and can be no longer than 32 characters.
     * 
     */
    @Export(name="displayName", type=String.class, parameters={})
    private Output<String> displayName;

    /**
     * @return The source’s display name. A source’s display name must be unique
     * amongst its siblings, for example, two sources with the same parent
     * can&#39;t share the same display name. The display name must start and end
     * with a letter or digit, may contain letters, digits, spaces, hyphens,
     * and underscores, and can be no longer than 32 characters.
     * 
     */
    public Output<String> displayName() {
        return this.displayName;
    }
    /**
     * The resource name of this source, in the format &#39;organizations/{{organization}}/sources/{{source}}&#39;.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The resource name of this source, in the format &#39;organizations/{{organization}}/sources/{{source}}&#39;.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The organization whose Cloud Security Command Center the Source
     * lives in.
     * 
     */
    @Export(name="organization", type=String.class, parameters={})
    private Output<String> organization;

    /**
     * @return The organization whose Cloud Security Command Center the Source
     * lives in.
     * 
     */
    public Output<String> organization() {
        return this.organization;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Source(String name) {
        this(name, SourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Source(String name, SourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Source(String name, SourceArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:securitycenter/source:Source", name, args == null ? SourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Source(String name, Output<String> id, @Nullable SourceState state, @Nullable CustomResourceOptions options) {
        super("gcp:securitycenter/source:Source", name, state, makeResourceOptions(options, id));
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
    public static Source get(String name, Output<String> id, @Nullable SourceState state, @Nullable CustomResourceOptions options) {
        return new Source(name, id, state, options);
    }
}
