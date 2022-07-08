// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.apigeeregistry.v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.apigeeregistry.v1.DeploymentArtifactArgs;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * CreateArtifact creates a specified artifact.
 * 
 */
@ResourceType(type="google-native:apigeeregistry/v1:DeploymentArtifact")
public class DeploymentArtifact extends com.pulumi.resources.CustomResource {
    @Export(name="apiId", type=String.class, parameters={})
    private Output<String> apiId;

    public Output<String> apiId() {
        return this.apiId;
    }
    /**
     * Required. The ID to use for the artifact, which will become the final component of the artifact&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     * 
     */
    @Export(name="artifactId", type=String.class, parameters={})
    private Output<String> artifactId;

    /**
     * @return Required. The ID to use for the artifact, which will become the final component of the artifact&#39;s resource name. This value should be 4-63 characters, and valid characters are /a-z-/. Following AIP-162, IDs must not have the form of a UUID.
     * 
     */
    public Output<String> artifactId() {
        return this.artifactId;
    }
    /**
     * Input only. The contents of the artifact. Provided by API callers when artifacts are created or replaced. To access the contents of an artifact, use GetArtifactContents.
     * 
     */
    @Export(name="contents", type=String.class, parameters={})
    private Output<String> contents;

    /**
     * @return Input only. The contents of the artifact. Provided by API callers when artifacts are created or replaced. To access the contents of an artifact, use GetArtifactContents.
     * 
     */
    public Output<String> contents() {
        return this.contents;
    }
    /**
     * Creation timestamp.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Creation timestamp.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    @Export(name="deploymentId", type=String.class, parameters={})
    private Output<String> deploymentId;

    public Output<String> deploymentId() {
        return this.deploymentId;
    }
    /**
     * A SHA-256 hash of the artifact&#39;s contents. If the artifact is gzipped, this is the hash of the uncompressed artifact.
     * 
     */
    @Export(name="hash", type=String.class, parameters={})
    private Output<String> hash;

    /**
     * @return A SHA-256 hash of the artifact&#39;s contents. If the artifact is gzipped, this is the hash of the uncompressed artifact.
     * 
     */
    public Output<String> hash() {
        return this.hash;
    }
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }
    /**
     * A content type specifier for the artifact. Content type specifiers are Media Types (https://en.wikipedia.org/wiki/Media_type) with a possible &#34;schema&#34; parameter that specifies a schema for the stored information. Content types can specify compression. Currently only GZip compression is supported (indicated with &#34;+gzip&#34;).
     * 
     */
    @Export(name="mimeType", type=String.class, parameters={})
    private Output<String> mimeType;

    /**
     * @return A content type specifier for the artifact. Content type specifiers are Media Types (https://en.wikipedia.org/wiki/Media_type) with a possible &#34;schema&#34; parameter that specifies a schema for the stored information. Content types can specify compression. Currently only GZip compression is supported (indicated with &#34;+gzip&#34;).
     * 
     */
    public Output<String> mimeType() {
        return this.mimeType;
    }
    /**
     * Resource name.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    @Export(name="project", type=String.class, parameters={})
    private Output<String> project;

    public Output<String> project() {
        return this.project;
    }
    /**
     * The size of the artifact in bytes. If the artifact is gzipped, this is the size of the uncompressed artifact.
     * 
     */
    @Export(name="sizeBytes", type=Integer.class, parameters={})
    private Output<Integer> sizeBytes;

    /**
     * @return The size of the artifact in bytes. If the artifact is gzipped, this is the size of the uncompressed artifact.
     * 
     */
    public Output<Integer> sizeBytes() {
        return this.sizeBytes;
    }
    /**
     * Last update timestamp.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return Last update timestamp.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeploymentArtifact(String name) {
        this(name, DeploymentArtifactArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeploymentArtifact(String name, DeploymentArtifactArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeploymentArtifact(String name, DeploymentArtifactArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigeeregistry/v1:DeploymentArtifact", name, args == null ? DeploymentArtifactArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeploymentArtifact(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:apigeeregistry/v1:DeploymentArtifact", name, null, makeResourceOptions(options, id));
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
    public static DeploymentArtifact get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeploymentArtifact(name, id, options);
    }
}
