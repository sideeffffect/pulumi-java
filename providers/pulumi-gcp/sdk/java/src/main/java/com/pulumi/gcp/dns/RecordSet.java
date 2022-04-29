// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dns;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.Utilities;
import com.pulumi.gcp.dns.RecordSetArgs;
import com.pulumi.gcp.dns.inputs.RecordSetState;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * DNS record sets can be imported using either of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:dns/recordSet:RecordSet frontend projects/{{project}}/managedZones/{{zone}}/rrsets/{{name}}/{{type}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/recordSet:RecordSet frontend {{project}}/{{zone}}/{{name}}/{{type}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:dns/recordSet:RecordSet frontend {{zone}}/{{name}}/{{type}}
 * ```
 * 
 *  NoteThe record name must include the trailing dot at the end.
 * 
 */
@ResourceType(type="gcp:dns/recordSet:RecordSet")
public class RecordSet extends CustomResource {
    /**
     * The name of the zone in which this record set will
     * reside.
     * 
     */
    @Export(name="managedZone", type=String.class, parameters={})
    private Output<String> managedZone;

    /**
     * @return The name of the zone in which this record set will
     * reside.
     * 
     */
    public Output<String> managedZone() {
        return this.managedZone;
    }
    /**
     * The DNS name this record set will apply to.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The DNS name this record set will apply to.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    public Output<String> project() {
        return this.project;
    }
    /**
     * The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
     * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
     * 
     */
    @Export(name="rrdatas", type=List.class, parameters={String.class})
    private Output<List<String>> rrdatas;

    /**
     * @return The string data for the records in this record set whose meaning depends on the DNS type. For TXT record, if the string
     * data contains spaces, add surrounding \&#34; if you don&#39;t want your string to get split on spaces. To specify a single
     * record value longer than 255 characters such as a TXT record for DKIM, add \&#34;\&#34; inside the Terraform configuration
     * string (e.g. &#34;first255characters\&#34;\&#34;morecharacters&#34;).
     * 
     */
    public Output<List<String>> rrdatas() {
        return this.rrdatas;
    }
    /**
     * The time-to-live of this record set (seconds).
     * 
     */
    @Export(name="ttl", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> ttl;

    /**
     * @return The time-to-live of this record set (seconds).
     * 
     */
    public Output<Optional<Integer>> ttl() {
        return Codegen.optional(this.ttl);
    }
    /**
     * The DNS record set type.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The DNS record set type.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RecordSet(String name) {
        this(name, RecordSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RecordSet(String name, RecordSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RecordSet(String name, RecordSetArgs args, @Nullable CustomResourceOptions options) {
        super("gcp:dns/recordSet:RecordSet", name, args == null ? RecordSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private RecordSet(String name, Output<String> id, @Nullable RecordSetState state, @Nullable CustomResourceOptions options) {
        super("gcp:dns/recordSet:RecordSet", name, state, makeResourceOptions(options, id));
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
    public static RecordSet get(String name, Output<String> id, @Nullable RecordSetState state, @Nullable CustomResourceOptions options) {
        return new RecordSet(name, id, state, options);
    }
}
