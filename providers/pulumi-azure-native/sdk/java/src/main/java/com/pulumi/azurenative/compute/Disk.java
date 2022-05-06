// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.compute.DiskArgs;
import com.pulumi.azurenative.compute.outputs.CreationDataResponse;
import com.pulumi.azurenative.compute.outputs.DiskSecurityProfileResponse;
import com.pulumi.azurenative.compute.outputs.DiskSkuResponse;
import com.pulumi.azurenative.compute.outputs.EncryptionResponse;
import com.pulumi.azurenative.compute.outputs.EncryptionSettingsCollectionResponse;
import com.pulumi.azurenative.compute.outputs.ExtendedLocationResponse;
import com.pulumi.azurenative.compute.outputs.PropertyUpdatesInProgressResponse;
import com.pulumi.azurenative.compute.outputs.PurchasePlanResponse;
import com.pulumi.azurenative.compute.outputs.ShareInfoElementResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Disk resource.
 * API Version: 2020-12-01.
 * 
 * ## Example Usage
 * ### Create a managed disk and associate with disk access resource.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.of(&#34;createOption&#34;, &#34;Empty&#34;))
 *             .diskAccessId(&#34;/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskAccesses/{existing-diskAccess-name}&#34;)
 *             .diskName(&#34;myDisk&#34;)
 *             .diskSizeGB(200)
 *             .location(&#34;West US&#34;)
 *             .networkAccessPolicy(&#34;AllowPrivate&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk and associate with disk encryption set.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.of(&#34;createOption&#34;, &#34;Empty&#34;))
 *             .diskName(&#34;myDisk&#34;)
 *             .diskSizeGB(200)
 *             .encryption(Map.of(&#34;diskEncryptionSetId&#34;, &#34;/subscriptions/{subscription-id}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/diskEncryptionSets/{existing-diskEncryptionSet-name}&#34;))
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk by copying a snapshot.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;Copy&#34;),
 *                 Map.entry(&#34;sourceResourceId&#34;, &#34;subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/snapshots/mySnapshot&#34;)
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk by importing an unmanaged blob from a different subscription.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;Import&#34;),
 *                 Map.entry(&#34;sourceUri&#34;, &#34;https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd&#34;),
 *                 Map.entry(&#34;storageAccountId&#34;, &#34;subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Storage/storageAccounts/myStorageAccount&#34;)
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk by importing an unmanaged blob from the same subscription.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;Import&#34;),
 *                 Map.entry(&#34;sourceUri&#34;, &#34;https://mystorageaccount.blob.core.windows.net/osimages/osimage.vhd&#34;)
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk from a platform image.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;FromImage&#34;),
 *                 Map.entry(&#34;imageReference&#34;, Map.of(&#34;id&#34;, &#34;/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/westus/Publishers/{publisher}/ArtifactTypes/VMImage/Offers/{offer}/Skus/{sku}/Versions/1.0.0&#34;))
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .location(&#34;West US&#34;)
 *             .osType(&#34;Windows&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk from an existing managed disk in the same or different subscription.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;Copy&#34;),
 *                 Map.entry(&#34;sourceResourceId&#34;, &#34;subscriptions/{subscriptionId}/resourceGroups/myResourceGroup/providers/Microsoft.Compute/disks/myDisk1&#34;)
 *             ))
 *             .diskName(&#34;myDisk2&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk with security profile
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;FromImage&#34;),
 *                 Map.entry(&#34;imageReference&#34;, Map.of(&#34;id&#34;, &#34;/Subscriptions/{subscriptionId}/Providers/Microsoft.Compute/Locations/uswest/Publishers/Microsoft/ArtifactTypes/VMImage/Offers/{offer}&#34;))
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .location(&#34;North Central US&#34;)
 *             .osType(&#34;Windows&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .securityProfile(Map.of(&#34;securityType&#34;, &#34;TrustedLaunch&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed disk with ssd zrs account type.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.of(&#34;createOption&#34;, &#34;Empty&#34;))
 *             .diskName(&#34;myDisk&#34;)
 *             .diskSizeGB(200)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;Premium_ZRS&#34;))
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create a managed upload disk.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;Upload&#34;),
 *                 Map.entry(&#34;uploadSizeBytes&#34;, 10737418752)
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create an empty managed disk in extended location.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.of(&#34;createOption&#34;, &#34;Empty&#34;))
 *             .diskName(&#34;myDisk&#34;)
 *             .diskSizeGB(200)
 *             .extendedLocation(Map.ofEntries(
 *                 Map.entry(&#34;name&#34;, &#34;{edge-zone-id}&#34;),
 *                 Map.entry(&#34;type&#34;, &#34;EdgeZone&#34;)
 *             ))
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create an empty managed disk.
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.of(&#34;createOption&#34;, &#34;Empty&#34;))
 *             .diskName(&#34;myDisk&#34;)
 *             .diskSizeGB(200)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### Create an ultra managed disk with logicalSectorSize 512E
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
 *         var disk = new Disk(&#34;disk&#34;, DiskArgs.builder()        
 *             .creationData(Map.ofEntries(
 *                 Map.entry(&#34;createOption&#34;, &#34;Empty&#34;),
 *                 Map.entry(&#34;logicalSectorSize&#34;, 512)
 *             ))
 *             .diskName(&#34;myDisk&#34;)
 *             .diskSizeGB(200)
 *             .location(&#34;West US&#34;)
 *             .resourceGroupName(&#34;myResourceGroup&#34;)
 *             .sku(Map.of(&#34;name&#34;, &#34;UltraSSD_LRS&#34;))
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
 * $ pulumi import azure-native:compute:Disk myDisk /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Compute/disks/{diskName} 
 * ```
 * 
 */
@ResourceType(type="azure-native:compute:Disk")
public class Disk extends com.pulumi.resources.CustomResource {
    /**
     * Set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     */
    @Export(name="burstingEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> burstingEnabled;

    /**
     * @return Set to true to enable bursting beyond the provisioned performance target of the disk. Bursting is disabled by default. Does not apply to Ultra disks.
     * 
     */
    public Output<Optional<Boolean>> burstingEnabled() {
        return Codegen.optional(this.burstingEnabled);
    }
    /**
     * Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
     */
    @Export(name="creationData", type=CreationDataResponse.class, parameters={})
    private Output<CreationDataResponse> creationData;

    /**
     * @return Disk source information. CreationData information cannot be changed after the disk has been created.
     * 
     */
    public Output<CreationDataResponse> creationData() {
        return this.creationData;
    }
    /**
     * ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     */
    @Export(name="diskAccessId", type=String.class, parameters={})
    private Output</* @Nullable */ String> diskAccessId;

    /**
     * @return ARM id of the DiskAccess resource for using private endpoints on disks.
     * 
     */
    public Output<Optional<String>> diskAccessId() {
        return Codegen.optional(this.diskAccessId);
    }
    /**
     * The total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     */
    @Export(name="diskIOPSReadOnly", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> diskIOPSReadOnly;

    /**
     * @return The total number of IOPS that will be allowed across all VMs mounting the shared disk as ReadOnly. One operation can transfer between 4k and 256k bytes.
     * 
     */
    public Output<Optional<Double>> diskIOPSReadOnly() {
        return Codegen.optional(this.diskIOPSReadOnly);
    }
    /**
     * The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     * 
     */
    @Export(name="diskIOPSReadWrite", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> diskIOPSReadWrite;

    /**
     * @return The number of IOPS allowed for this disk; only settable for UltraSSD disks. One operation can transfer between 4k and 256k bytes.
     * 
     */
    public Output<Optional<Double>> diskIOPSReadWrite() {
        return Codegen.optional(this.diskIOPSReadWrite);
    }
    /**
     * The total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     */
    @Export(name="diskMBpsReadOnly", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> diskMBpsReadOnly;

    /**
     * @return The total throughput (MBps) that will be allowed across all VMs mounting the shared disk as ReadOnly. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     */
    public Output<Optional<Double>> diskMBpsReadOnly() {
        return Codegen.optional(this.diskMBpsReadOnly);
    }
    /**
     * The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     */
    @Export(name="diskMBpsReadWrite", type=Double.class, parameters={})
    private Output</* @Nullable */ Double> diskMBpsReadWrite;

    /**
     * @return The bandwidth allowed for this disk; only settable for UltraSSD disks. MBps means millions of bytes per second - MB here uses the ISO notation, of powers of 10.
     * 
     */
    public Output<Optional<Double>> diskMBpsReadWrite() {
        return Codegen.optional(this.diskMBpsReadWrite);
    }
    /**
     * The size of the disk in bytes. This field is read only.
     * 
     */
    @Export(name="diskSizeBytes", type=Double.class, parameters={})
    private Output<Double> diskSizeBytes;

    /**
     * @return The size of the disk in bytes. This field is read only.
     * 
     */
    public Output<Double> diskSizeBytes() {
        return this.diskSizeBytes;
    }
    /**
     * If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk&#39;s size.
     * 
     */
    @Export(name="diskSizeGB", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> diskSizeGB;

    /**
     * @return If creationData.createOption is Empty, this field is mandatory and it indicates the size of the disk to create. If this field is present for updates or creation with other options, it indicates a resize. Resizes are only allowed if the disk is not attached to a running VM, and can only increase the disk&#39;s size.
     * 
     */
    public Output<Optional<Integer>> diskSizeGB() {
        return Codegen.optional(this.diskSizeGB);
    }
    /**
     * The state of the disk.
     * 
     */
    @Export(name="diskState", type=String.class, parameters={})
    private Output<String> diskState;

    /**
     * @return The state of the disk.
     * 
     */
    public Output<String> diskState() {
        return this.diskState;
    }
    /**
     * Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
     */
    @Export(name="encryption", type=EncryptionResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionResponse> encryption;

    /**
     * @return Encryption property can be used to encrypt data at rest with customer managed keys or platform managed keys.
     * 
     */
    public Output<Optional<EncryptionResponse>> encryption() {
        return Codegen.optional(this.encryption);
    }
    /**
     * Encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
     */
    @Export(name="encryptionSettingsCollection", type=EncryptionSettingsCollectionResponse.class, parameters={})
    private Output</* @Nullable */ EncryptionSettingsCollectionResponse> encryptionSettingsCollection;

    /**
     * @return Encryption settings collection used for Azure Disk Encryption, can contain multiple encryption settings per disk or snapshot.
     * 
     */
    public Output<Optional<EncryptionSettingsCollectionResponse>> encryptionSettingsCollection() {
        return Codegen.optional(this.encryptionSettingsCollection);
    }
    /**
     * The extended location where the disk will be created. Extended location cannot be changed.
     * 
     */
    @Export(name="extendedLocation", type=ExtendedLocationResponse.class, parameters={})
    private Output</* @Nullable */ ExtendedLocationResponse> extendedLocation;

    /**
     * @return The extended location where the disk will be created. Extended location cannot be changed.
     * 
     */
    public Output<Optional<ExtendedLocationResponse>> extendedLocation() {
        return Codegen.optional(this.extendedLocation);
    }
    /**
     * The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    @Export(name="hyperVGeneration", type=String.class, parameters={})
    private Output</* @Nullable */ String> hyperVGeneration;

    /**
     * @return The hypervisor generation of the Virtual Machine. Applicable to OS disks only.
     * 
     */
    public Output<Optional<String>> hyperVGeneration() {
        return Codegen.optional(this.hyperVGeneration);
    }
    /**
     * Resource location
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output<String> location;

    /**
     * @return Resource location
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    @Export(name="managedBy", type=String.class, parameters={})
    private Output<String> managedBy;

    /**
     * @return A relative URI containing the ID of the VM that has the disk attached.
     * 
     */
    public Output<String> managedBy() {
        return this.managedBy;
    }
    /**
     * List of relative URIs containing the IDs of the VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     */
    @Export(name="managedByExtended", type=List.class, parameters={String.class})
    private Output<List<String>> managedByExtended;

    /**
     * @return List of relative URIs containing the IDs of the VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     */
    public Output<List<String>> managedByExtended() {
        return this.managedByExtended;
    }
    /**
     * The maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     */
    @Export(name="maxShares", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> maxShares;

    /**
     * @return The maximum number of VMs that can attach to the disk at the same time. Value greater than one indicates a disk that can be mounted on multiple VMs at the same time.
     * 
     */
    public Output<Optional<Integer>> maxShares() {
        return Codegen.optional(this.maxShares);
    }
    /**
     * Resource name
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Resource name
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Policy for accessing the disk via network.
     * 
     */
    @Export(name="networkAccessPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> networkAccessPolicy;

    /**
     * @return Policy for accessing the disk via network.
     * 
     */
    public Output<Optional<String>> networkAccessPolicy() {
        return Codegen.optional(this.networkAccessPolicy);
    }
    /**
     * The Operating System type.
     * 
     */
    @Export(name="osType", type=String.class, parameters={})
    private Output</* @Nullable */ String> osType;

    /**
     * @return The Operating System type.
     * 
     */
    public Output<Optional<String>> osType() {
        return Codegen.optional(this.osType);
    }
    /**
     * Properties of the disk for which update is pending.
     * 
     */
    @Export(name="propertyUpdatesInProgress", type=PropertyUpdatesInProgressResponse.class, parameters={})
    private Output<PropertyUpdatesInProgressResponse> propertyUpdatesInProgress;

    /**
     * @return Properties of the disk for which update is pending.
     * 
     */
    public Output<PropertyUpdatesInProgressResponse> propertyUpdatesInProgress() {
        return this.propertyUpdatesInProgress;
    }
    /**
     * The disk provisioning state.
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return The disk provisioning state.
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * Purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}
     * 
     */
    @Export(name="purchasePlan", type=PurchasePlanResponse.class, parameters={})
    private Output</* @Nullable */ PurchasePlanResponse> purchasePlan;

    /**
     * @return Purchase plan information for the the image from which the OS disk was created. E.g. - {name: 2019-Datacenter, publisher: MicrosoftWindowsServer, product: WindowsServer}
     * 
     */
    public Output<Optional<PurchasePlanResponse>> purchasePlan() {
        return Codegen.optional(this.purchasePlan);
    }
    /**
     * Contains the security related information for the resource.
     * 
     */
    @Export(name="securityProfile", type=DiskSecurityProfileResponse.class, parameters={})
    private Output</* @Nullable */ DiskSecurityProfileResponse> securityProfile;

    /**
     * @return Contains the security related information for the resource.
     * 
     */
    public Output<Optional<DiskSecurityProfileResponse>> securityProfile() {
        return Codegen.optional(this.securityProfile);
    }
    /**
     * Details of the list of all VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     */
    @Export(name="shareInfo", type=List.class, parameters={ShareInfoElementResponse.class})
    private Output<List<ShareInfoElementResponse>> shareInfo;

    /**
     * @return Details of the list of all VMs that have the disk attached. maxShares should be set to a value greater than one for disks to allow attaching them to multiple VMs.
     * 
     */
    public Output<List<ShareInfoElementResponse>> shareInfo() {
        return this.shareInfo;
    }
    /**
     * The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
     * 
     */
    @Export(name="sku", type=DiskSkuResponse.class, parameters={})
    private Output</* @Nullable */ DiskSkuResponse> sku;

    /**
     * @return The disks sku name. Can be Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, or StandardSSD_ZRS.
     * 
     */
    public Output<Optional<DiskSkuResponse>> sku() {
        return Codegen.optional(this.sku);
    }
    /**
     * Indicates the OS on a disk supports hibernation.
     * 
     */
    @Export(name="supportsHibernation", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> supportsHibernation;

    /**
     * @return Indicates the OS on a disk supports hibernation.
     * 
     */
    public Output<Optional<Boolean>> supportsHibernation() {
        return Codegen.optional(this.supportsHibernation);
    }
    /**
     * Resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Performance tier of the disk (e.g, P4, S10) as described here: https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     */
    @Export(name="tier", type=String.class, parameters={})
    private Output</* @Nullable */ String> tier;

    /**
     * @return Performance tier of the disk (e.g, P4, S10) as described here: https://azure.microsoft.com/en-us/pricing/details/managed-disks/. Does not apply to Ultra disks.
     * 
     */
    public Output<Optional<String>> tier() {
        return Codegen.optional(this.tier);
    }
    /**
     * The time when the disk was created.
     * 
     */
    @Export(name="timeCreated", type=String.class, parameters={})
    private Output<String> timeCreated;

    /**
     * @return The time when the disk was created.
     * 
     */
    public Output<String> timeCreated() {
        return this.timeCreated;
    }
    /**
     * Resource type
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Resource type
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Unique Guid identifying the resource.
     * 
     */
    @Export(name="uniqueId", type=String.class, parameters={})
    private Output<String> uniqueId;

    /**
     * @return Unique Guid identifying the resource.
     * 
     */
    public Output<String> uniqueId() {
        return this.uniqueId;
    }
    /**
     * The Logical zone list for Disk.
     * 
     */
    @Export(name="zones", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> zones;

    /**
     * @return The Logical zone list for Disk.
     * 
     */
    public Output<Optional<List<String>>> zones() {
        return Codegen.optional(this.zones);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Disk(String name) {
        this(name, DiskArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Disk(String name, DiskArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Disk(String name, DiskArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:Disk", name, args == null ? DiskArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Disk(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:compute:Disk", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:compute/v20160430preview:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20170330:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180401:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180601:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20180930:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190301:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20190701:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20191101:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200501:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200630:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20200930:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20201201:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210401:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20210801:Disk").build()),
                Output.of(Alias.builder().type("azure-native:compute/v20211201:Disk").build())
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
    public static Disk get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Disk(name, id, options);
    }
}
