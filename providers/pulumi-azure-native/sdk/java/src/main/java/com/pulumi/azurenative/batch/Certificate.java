// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.batch.CertificateArgs;
import com.pulumi.azurenative.batch.outputs.DeleteCertificateErrorResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Contains information about a certificate.
 * API Version: 2021-01-01.
 * 
 * ## Example Usage
 * ### CreateCertificate - Full
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var certificate = new Certificate(&#34;certificate&#34;, CertificateArgs.builder()        
 *             .accountName(&#34;sampleacct&#34;)
 *             .certificateName(&#34;sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e&#34;)
 *             .data(&#34;MIIJsgIBAzCCCW4GCSqGSIb3DQE...&#34;)
 *             .format(&#34;Pfx&#34;)
 *             .password(&#34;&lt;ExamplePassword&gt;&#34;)
 *             .resourceGroupName(&#34;default-azurebatch-japaneast&#34;)
 *             .thumbprint(&#34;0a0e4f50d51beadeac1d35afc5116098e7902e6e&#34;)
 *             .thumbprintAlgorithm(&#34;sha1&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### CreateCertificate - Minimal Cer
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var certificate = new Certificate(&#34;certificate&#34;, CertificateArgs.builder()        
 *             .accountName(&#34;sampleacct&#34;)
 *             .certificateName(&#34;sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e&#34;)
 *             .data(&#34;MIICrjCCAZagAwI...&#34;)
 *             .format(&#34;Cer&#34;)
 *             .resourceGroupName(&#34;default-azurebatch-japaneast&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### CreateCertificate - Minimal Pfx
 * 
 * ```java
 * package generated_program;
 * 
 * import java.util.*;
 * import java.io.*;
 * import java.nio.*;
 * import com.pulumi.*;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var certificate = new Certificate(&#34;certificate&#34;, CertificateArgs.builder()        
 *             .accountName(&#34;sampleacct&#34;)
 *             .certificateName(&#34;sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e&#34;)
 *             .data(&#34;MIIJsgIBAzCCCW4GCSqGSIb3DQE...&#34;)
 *             .password(&#34;&lt;ExamplePassword&gt;&#34;)
 *             .resourceGroupName(&#34;default-azurebatch-japaneast&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:batch:Certificate sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e /subscriptions/subid/resourceGroups/default-azurebatch-japaneast/providers/Microsoft.Batch/batchAccounts/samplecct/certificates/sha1-0a0e4f50d51beadeac1d35afc5116098e7902e6e 
 * ```
 * 
 */
@ResourceType(type="azure-native:batch:Certificate")
public class Certificate extends com.pulumi.resources.CustomResource {
    /**
     * This is only returned when the certificate provisioningState is &#39;Failed&#39;.
     * 
     */
    @Export(name="deleteCertificateError", type=DeleteCertificateErrorResponse.class, parameters={})
    private Output<DeleteCertificateErrorResponse> deleteCertificateError;

    /**
     * @return This is only returned when the certificate provisioningState is &#39;Failed&#39;.
     * 
     */
    public Output<DeleteCertificateErrorResponse> deleteCertificateError() {
        return this.deleteCertificateError;
    }
    /**
     * The ETag of the resource, used for concurrency statements.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return The ETag of the resource, used for concurrency statements.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    @Export(name="format", type=String.class, parameters={})
    private Output</* @Nullable */ String> format;

    /**
     * @return The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     * 
     */
    public Output<Optional<String>> format() {
        return Codegen.optional(this.format);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The previous provisioned state of the resource
     * 
     */
    @Export(name="previousProvisioningState", type=String.class, parameters={})
    private Output<String> previousProvisioningState;

    /**
     * @return The previous provisioned state of the resource
     * 
     */
    public Output<String> previousProvisioningState() {
        return this.previousProvisioningState;
    }
    @Export(name="previousProvisioningStateTransitionTime", type=String.class, parameters={})
    private Output<String> previousProvisioningStateTransitionTime;

    public Output<String> previousProvisioningStateTransitionTime() {
        return this.previousProvisioningStateTransitionTime;
    }
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    @Export(name="provisioningStateTransitionTime", type=String.class, parameters={})
    private Output<String> provisioningStateTransitionTime;

    public Output<String> provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }
    /**
     * The public key of the certificate.
     * 
     */
    @Export(name="publicData", type=String.class, parameters={})
    private Output<String> publicData;

    /**
     * @return The public key of the certificate.
     * 
     */
    public Output<String> publicData() {
        return this.publicData;
    }
    /**
     * This must match the thumbprint from the name.
     * 
     */
    @Export(name="thumbprint", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprint;

    /**
     * @return This must match the thumbprint from the name.
     * 
     */
    public Output<Optional<String>> thumbprint() {
        return Codegen.optional(this.thumbprint);
    }
    /**
     * This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
     * 
     */
    @Export(name="thumbprintAlgorithm", type=String.class, parameters={})
    private Output</* @Nullable */ String> thumbprintAlgorithm;

    /**
     * @return This must match the first portion of the certificate name. Currently required to be &#39;SHA1&#39;.
     * 
     */
    public Output<Optional<String>> thumbprintAlgorithm() {
        return Codegen.optional(this.thumbprintAlgorithm);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Certificate(String name) {
        this(name, CertificateArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Certificate(String name, CertificateArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Certificate(String name, CertificateArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Certificate", name, args == null ? CertificateArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Certificate(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:batch:Certificate", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:batch/v20170901:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20181201:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20190401:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20190801:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200301:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200501:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20200901:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20210101:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20210601:Certificate").build()),
                Output.of(Alias.builder().type("azure-native:batch/v20220101:Certificate").build())
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Certificate get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Certificate(name, id, options);
    }
}
