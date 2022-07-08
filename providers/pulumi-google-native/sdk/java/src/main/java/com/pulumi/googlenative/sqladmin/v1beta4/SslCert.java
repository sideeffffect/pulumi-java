// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin.v1beta4;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.sqladmin.v1beta4.SslCertArgs;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates an SSL certificate and returns it along with the private key and server certificate authority. The new certificate will not be usable until the instance is restarted.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:sqladmin/v1beta4:SslCert")
public class SslCert extends com.pulumi.resources.CustomResource {
    /**
     * PEM representation.
     * 
     */
    @Export(name="cert", type=String.class, parameters={})
    private Output<String> cert;

    /**
     * @return PEM representation.
     * 
     */
    public Output<String> cert() {
        return this.cert;
    }
    /**
     * Serial number, as extracted from the certificate.
     * 
     */
    @Export(name="certSerialNumber", type=String.class, parameters={})
    private Output<String> certSerialNumber;

    /**
     * @return Serial number, as extracted from the certificate.
     * 
     */
    public Output<String> certSerialNumber() {
        return this.certSerialNumber;
    }
    /**
     * User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    @Export(name="commonName", type=String.class, parameters={})
    private Output<String> commonName;

    /**
     * @return User supplied name. Constrained to [a-zA-Z.-_ ]+.
     * 
     */
    public Output<String> commonName() {
        return this.commonName;
    }
    /**
     * The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the certificate was created in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    /**
     * The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    @Export(name="expirationTime", type=String.class, parameters={})
    private Output<String> expirationTime;

    /**
     * @return The time when the certificate expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    public Output<String> expirationTime() {
        return this.expirationTime;
    }
    @Export(name="instance", type=String.class, parameters={})
    private Output<String> instance;

    public Output<String> instance() {
        return this.instance;
    }
    /**
     * This is always `sql#sslCert`.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return This is always `sql#sslCert`.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The URI of this resource.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of this resource.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }
    /**
     * Sha1 Fingerprint.
     * 
     */
    @Export(name="sha1Fingerprint", type=String.class, parameters={})
    private Output<String> sha1Fingerprint;

    /**
     * @return Sha1 Fingerprint.
     * 
     */
    public Output<String> sha1Fingerprint() {
        return this.sha1Fingerprint;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SslCert(String name) {
        this(name, SslCertArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SslCert(String name, SslCertArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SslCert(String name, SslCertArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:SslCert", name, args == null ? SslCertArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SslCert(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:sqladmin/v1beta4:SslCert", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SslCert get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SslCert(name, id, options);
    }
}
