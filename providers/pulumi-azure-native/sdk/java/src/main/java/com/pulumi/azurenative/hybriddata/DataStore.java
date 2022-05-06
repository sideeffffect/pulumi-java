// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.hybriddata;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.hybriddata.DataStoreArgs;
import com.pulumi.azurenative.hybriddata.outputs.CustomerSecretResponse;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Data store.
 * API Version: 2019-06-01.
 * 
 * ## Example Usage
 * ### DataStores_CreateOrUpdate_DataSinkPUT162
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
 *         var dataStore = new DataStore(&#34;dataStore&#34;, DataStoreArgs.builder()        
 *             .customerSecrets(            
 *                 Map.ofEntries(
 *                     Map.entry(&#34;algorithm&#34;, &#34;RSA1_5&#34;),
 *                     Map.entry(&#34;keyIdentifier&#34;, &#34;StorageAccountAccessKey&#34;),
 *                     Map.entry(&#34;keyValue&#34;, &#34;Of4H9eF03G8QuxvkZQEbFWv3YdN3U//WugzuqReQekbXXQyg+QSicVKrwSOOKVi1zWMYGbKg7d5/ES2gdz+O5ZEw89bvE4mJD/wQmkIsqhPnbN0gyVK6nZePXVUU1A+UzjLfvhSA6KyUQfzNAZ5/TLt6fo1JyQrKTtkvnkLFyfv1AqBZ+dw8JK3RZi/rEN8HD3R3qsBwUYfyEuGLGiujy2CGrr/1uPiUVMR6QuFWRsjm39eMSHa4maLg4tQ0IY/jIy8rMlx3KjF3CcCbPzAqEq5vXy37wkjZbus771te1gLSrzcpVKIMg4DrmgaoJ02jAu+izBjNgLXAFPSUneQ8yw==:ezMkh4PMhCnjJtYkpTaP0SdblP5VAeRe4glW2PgIzICHw3T8ZyGDoaTrCv4/m5wtcEhWdtxhta+j1MQWlK5MIA+hvf8QjIDIjQv696ov5y+pcFe/upd2ekGOei7FCwB2u7I8WnkAtIKTUkf6eDQBZXm26DjfG1Dlc+Mjjq+AerukEa6WpOyqrD7Qub26Pgmj4AsuBx19X1EAmTZacubkoiNagXM8V+IDanHOhLMvfgQ7rw8oZhWfofxi4m+eJqjOXXaqSyorNK8UEcqP6P9pDP8AN8ulXEx6rZy2B5Oi0vSV+wlRLbUuQslga4ItOGxctW/ZX8uWozt+5A3k4URt6A==&#34;)
 *                 ),
 *                 Map.ofEntries(
 *                     Map.entry(&#34;algorithm&#34;, &#34;RSA1_5&#34;),
 *                     Map.entry(&#34;keyIdentifier&#34;, &#34;StorageAccountAccessKeyForQueue&#34;),
 *                     Map.entry(&#34;keyValue&#34;, &#34;Of4H9eF03G8QuxvkZQEbFWv3YdN3U//WugzuqReQekbXXQyg+QSicVKrwSOOKVi1zWMYGbKg7d5/ES2gdz+O5ZEw89bvE4mJD/wQmkIsqhPnbN0gyVK6nZePXVUU1A+UzjLfvhSA6KyUQfzNAZ5/TLt6fo1JyQrKTtkvnkLFyfv1AqBZ+dw8JK3RZi/rEN8HD3R3qsBwUYfyEuGLGiujy2CGrr/1uPiUVMR6QuFWRsjm39eMSHa4maLg4tQ0IY/jIy8rMlx3KjF3CcCbPzAqEq5vXy37wkjZbus771te1gLSrzcpVKIMg4DrmgaoJ02jAu+izBjNgLXAFPSUneQ8yw==:ezMkh4PMhCnjJtYkpTaP0SdblP5VAeRe4glW2PgIzICHw3T8ZyGDoaTrCv4/m5wtcEhWdtxhta+j1MQWlK5MIA+hvf8QjIDIjQv696ov5y+pcFe/upd2ekGOei7FCwB2u7I8WnkAtIKTUkf6eDQBZXm26DjfG1Dlc+Mjjq+AerukEa6WpOyqrD7Qub26Pgmj4AsuBx19X1EAmTZacubkoiNagXM8V+IDanHOhLMvfgQ7rw8oZhWfofxi4m+eJqjOXXaqSyorNK8UEcqP6P9pDP8AN8ulXEx6rZy2B5Oi0vSV+wlRLbUuQslga4ItOGxctW/ZX8uWozt+5A3k4URt6A==&#34;)
 *                 ))
 *             .dataManagerName(&#34;TestAzureSDKOperations&#34;)
 *             .dataStoreName(&#34;TestAzureStorage1&#34;)
 *             .dataStoreTypeId(&#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataStoreTypes/AzureStorageAccount&#34;)
 *             .extendedProperties(Map.ofEntries(
 *                 Map.entry(&#34;extendedSaKey&#34;, null),
 *                 Map.entry(&#34;extendedSaName&#34;, &#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.Storage/storageAccounts/dmsdatasink&#34;),
 *                 Map.entry(&#34;storageAccountNameForQueue&#34;, &#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.Storage/storageAccounts/dmsdatasink&#34;)
 *             ))
 *             .repositoryId(&#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.Storage/storageAccounts/dmsdatasink&#34;)
 *             .resourceGroupName(&#34;ResourceGroupForSDKTest&#34;)
 *             .state(&#34;Enabled&#34;)
 *             .build());
 * 
 *         }
 * }
 * 
 * ```
 * ### DataStores_CreateOrUpdate_DataSourcePUT162
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
 *         var dataStore = new DataStore(&#34;dataStore&#34;, DataStoreArgs.builder()        
 *             .customerSecrets(Map.ofEntries(
 *                 Map.entry(&#34;algorithm&#34;, &#34;RSA1_5&#34;),
 *                 Map.entry(&#34;keyIdentifier&#34;, &#34;ServiceEncryptionKey&#34;),
 *                 Map.entry(&#34;keyValue&#34;, &#34;EVuEBV40qv23xDRL4NZBuMms4e3So6ikHjrQYRvG9NloqxdgPOg+ZYzpho5lytI4fmv0ANmRIvDiDboRXcUVSjbB9T2gm19fMIuwZa4FK2+LYEgMqKK1GaLkk7xC8f5IeFUXLo6KyBBpaAiayTnWDcHuYEpMiGrV7trDDcbhMRefO3CHecmH3Z7ye8L0RQ/e7WW8GlCKZj3m0BaG7OrJgjai8gyDfMfGAG5rTqEhDVh2hLQ+TjvUjcOFwHvJusqKTENtbJTNQYmL9wZXsnwBvUwxqrGieILNB7V3GD1Ow9OiV0UCDW1e9LnMueukg+l7YJCU9FUhIPh/nSif6p32zw==:jCfio+pDtY3BSPZDpDJ0L6QdXLYMeOmxaFWtYTOZkNqNTgT8Loc/KSQRjtWS5K4N4btbznuSJ/dzg0aZEzlXgKDSuZgMfd4Ch92ZwAC/BkeCmVrTjiKJsoQXO1IICCUf7GHGBbYnnpsNJcEn4vyc9NXyKwOBjeU+I9AyK7PtYiC03RLpTS6xttFCICteBV0uoBHAiV0chZ5VIIUUMjO9u8EhHqRY7NNcGbWdVJeAb6J3vH4E/DHkQj+DXlpjcLvmK/uqBwxfNju30RJhR04Nmz6zcv/zTcvS0uN5hEPQoHLyv84hjnc4omg/gmNjo2cDW64QxA3RTJ5Sl///4xTBkg==&#34;)
 *             ))
 *             .dataManagerName(&#34;TestAzureSDKOperations&#34;)
 *             .dataStoreName(&#34;TestStorSimpleSource1&#34;)
 *             .dataStoreTypeId(&#34;/subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataStoreTypes/StorSimple8000Series&#34;)
 *             .extendedProperties(Map.ofEntries(
 *                 Map.entry(&#34;extendedSaKey&#34;, null),
 *                 Map.entry(&#34;resourceId&#34;, &#34;/subscriptions/c5fc377d-0085-41b9-86b7-cc96dc56d1e9/resourceGroups/ForDMS/providers/Microsoft.StorSimple/managers/BLR8600&#34;)
 *             ))
 *             .repositoryId(&#34;/subscriptions/c5fc377d-0085-41b9-86b7-cc96dc56d1e9/resourceGroups/ForDMS/providers/Microsoft.StorSimple/managers/BLR8600&#34;)
 *             .resourceGroupName(&#34;ResourceGroupForSDKTest&#34;)
 *             .state(&#34;Enabled&#34;)
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
 * $ pulumi import azure-native:hybriddata:DataStore TestStorSimpleSource1 /subscriptions/6e0219f5-327a-4365-904f-05eed4227ad7/resourceGroups/ResourceGroupForSDKTest/providers/Microsoft.HybridData/dataManagers/TestAzureSDKOperations/dataStores/TestStorSimpleSource1 
 * ```
 * 
 */
@ResourceType(type="azure-native:hybriddata:DataStore")
public class DataStore extends com.pulumi.resources.CustomResource {
    /**
     * List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    @Export(name="customerSecrets", type=List.class, parameters={CustomerSecretResponse.class})
    private Output</* @Nullable */ List<CustomerSecretResponse>> customerSecrets;

    /**
     * @return List of customer secrets containing a key identifier and key value. The key identifier is a way for the specific data source to understand the key. Value contains customer secret encrypted by the encryptionKeys.
     * 
     */
    public Output<Optional<List<CustomerSecretResponse>>> customerSecrets() {
        return Codegen.optional(this.customerSecrets);
    }
    /**
     * The arm id of the data store type.
     * 
     */
    @Export(name="dataStoreTypeId", type=String.class, parameters={})
    private Output<String> dataStoreTypeId;

    /**
     * @return The arm id of the data store type.
     * 
     */
    public Output<String> dataStoreTypeId() {
        return this.dataStoreTypeId;
    }
    /**
     * A generic json used differently by each data source type.
     * 
     */
    @Export(name="extendedProperties", type=Object.class, parameters={})
    private Output</* @Nullable */ Object> extendedProperties;

    /**
     * @return A generic json used differently by each data source type.
     * 
     */
    public Output<Optional<Object>> extendedProperties() {
        return Codegen.optional(this.extendedProperties);
    }
    /**
     * Name of the object.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the object.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
     */
    @Export(name="repositoryId", type=String.class, parameters={})
    private Output</* @Nullable */ String> repositoryId;

    /**
     * @return Arm Id for the manager resource to which the data source is associated. This is optional.
     * 
     */
    public Output<Optional<String>> repositoryId() {
        return Codegen.optional(this.repositoryId);
    }
    /**
     * State of the data source.
     * 
     */
    @Export(name="state", type=String.class, parameters={})
    private Output<String> state;

    /**
     * @return State of the data source.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * Type of the object.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return Type of the object.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataStore(String name) {
        this(name, DataStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataStore(String name, DataStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataStore(String name, DataStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:DataStore", name, args == null ? DataStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataStore(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("azure-native:hybriddata:DataStore", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:hybriddata/v20160601:DataStore").build()),
                Output.of(Alias.builder().type("azure-native:hybriddata/v20190601:DataStore").build())
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
    public static DataStore get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataStore(name, id, options);
    }
}
