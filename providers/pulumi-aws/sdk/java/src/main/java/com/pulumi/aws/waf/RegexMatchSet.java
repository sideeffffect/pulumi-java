// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.RegexMatchSetArgs;
import com.pulumi.aws.waf.inputs.RegexMatchSetState;
import com.pulumi.aws.waf.outputs.RegexMatchSetRegexMatchTuple;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Provides a WAF Regex Match Set Resource
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * WAF Regex Match Set can be imported using their ID, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:waf/regexMatchSet:RegexMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/regexMatchSet:RegexMatchSet")
public class RegexMatchSet extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name or description of the Regex Match Set.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name or description of the Regex Match Set.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    @Export(name="regexMatchTuples", type=List.class, parameters={RegexMatchSetRegexMatchTuple.class})
    private Output</* @Nullable */ List<RegexMatchSetRegexMatchTuple>> regexMatchTuples;

    /**
     * @return The regular expression pattern that you want AWS WAF to search for in web requests, the location in requests that you want AWS WAF to search, and other settings. See below.
     * 
     */
    public Output</* @Nullable */ List<RegexMatchSetRegexMatchTuple>> regexMatchTuples() {
        return this.regexMatchTuples;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegexMatchSet(String name) {
        this(name, RegexMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegexMatchSet(String name, @Nullable RegexMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegexMatchSet(String name, @Nullable RegexMatchSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/regexMatchSet:RegexMatchSet", name, args == null ? RegexMatchSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RegexMatchSet(String name, Output<String> id, @Nullable RegexMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/regexMatchSet:RegexMatchSet", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
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
    public static RegexMatchSet get(String name, Output<String> id, @Nullable RegexMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new RegexMatchSet(name, id, state, options);
    }
}
