// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.kubernetes.core_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.kubernetes.Utilities;
import com.pulumi.kubernetes.core_v1.ServiceAccountArgs;
import com.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import com.pulumi.kubernetes.core_v1.outputs.ObjectReference;
import com.pulumi.kubernetes.meta_v1.outputs.ObjectMeta;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
 * 
 */
@ResourceType(type="kubernetes:core/v1:ServiceAccount")
public class ServiceAccount extends com.pulumi.resources.CustomResource {
    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Export(name="apiVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> apiVersion;

    /**
     * @return APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    public Output</* @Nullable */ String> apiVersion() {
        return this.apiVersion;
    }
    /**
     * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
     * 
     */
    @Export(name="automountServiceAccountToken", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> automountServiceAccountToken;

    /**
     * @return AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
     * 
     */
    public Output</* @Nullable */ Boolean> automountServiceAccountToken() {
        return this.automountServiceAccountToken;
    }
    /**
     * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     * 
     */
    @Export(name="imagePullSecrets", type=List.class, parameters={LocalObjectReference.class})
    private Output</* @Nullable */ List<LocalObjectReference>> imagePullSecrets;

    /**
     * @return ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
     * 
     */
    public Output</* @Nullable */ List<LocalObjectReference>> imagePullSecrets() {
        return this.imagePullSecrets;
    }
    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output</* @Nullable */ String> kind;

    /**
     * @return Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    public Output</* @Nullable */ String> kind() {
        return this.kind;
    }
    /**
     * Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    @Export(name="metadata", type=ObjectMeta.class, parameters={})
    private Output</* @Nullable */ ObjectMeta> metadata;

    /**
     * @return Standard object's metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
     * 
     */
    public Output</* @Nullable */ ObjectMeta> metadata() {
        return this.metadata;
    }
    /**
     * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
     * 
     */
    @Export(name="secrets", type=List.class, parameters={ObjectReference.class})
    private Output</* @Nullable */ List<ObjectReference>> secrets;

    /**
     * @return Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
     * 
     */
    public Output</* @Nullable */ List<ObjectReference>> secrets() {
        return this.secrets;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ServiceAccount(String name) {
        this(name, ServiceAccountArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ServiceAccount(String name, @Nullable ServiceAccountArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ServiceAccount(String name, @Nullable ServiceAccountArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ServiceAccount", name, makeArgs(args), makeResourceOptions(options, Codegen.empty()));
    }

    private ServiceAccount(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("kubernetes:core/v1:ServiceAccount", name, null, makeResourceOptions(options, id));
    }

    private static ServiceAccountArgs makeArgs(@Nullable ServiceAccountArgs args) {
        var builder = args == null ? ServiceAccountArgs.builder() : ServiceAccountArgs.builder(args);
        return builder
            .apiVersion("v1")
            .kind("ServiceAccount")
            .build();
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
    public static ServiceAccount get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ServiceAccount(name, id, options);
    }
}
