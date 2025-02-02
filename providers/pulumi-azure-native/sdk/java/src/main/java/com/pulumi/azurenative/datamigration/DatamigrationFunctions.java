// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.datamigration.inputs.GetDatabaseMigrationsSqlDbArgs;
import com.pulumi.azurenative.datamigration.inputs.GetDatabaseMigrationsSqlDbPlainArgs;
import com.pulumi.azurenative.datamigration.inputs.GetFileArgs;
import com.pulumi.azurenative.datamigration.inputs.GetFilePlainArgs;
import com.pulumi.azurenative.datamigration.inputs.GetProjectArgs;
import com.pulumi.azurenative.datamigration.inputs.GetProjectPlainArgs;
import com.pulumi.azurenative.datamigration.inputs.GetServiceArgs;
import com.pulumi.azurenative.datamigration.inputs.GetServicePlainArgs;
import com.pulumi.azurenative.datamigration.inputs.GetSqlMigrationServiceArgs;
import com.pulumi.azurenative.datamigration.inputs.GetSqlMigrationServicePlainArgs;
import com.pulumi.azurenative.datamigration.inputs.GetTaskArgs;
import com.pulumi.azurenative.datamigration.inputs.GetTaskPlainArgs;
import com.pulumi.azurenative.datamigration.inputs.ListSqlMigrationServiceAuthKeysArgs;
import com.pulumi.azurenative.datamigration.inputs.ListSqlMigrationServiceAuthKeysPlainArgs;
import com.pulumi.azurenative.datamigration.inputs.ListSqlMigrationServiceMonitoringDataArgs;
import com.pulumi.azurenative.datamigration.inputs.ListSqlMigrationServiceMonitoringDataPlainArgs;
import com.pulumi.azurenative.datamigration.outputs.GetDatabaseMigrationsSqlDbResult;
import com.pulumi.azurenative.datamigration.outputs.GetFileResult;
import com.pulumi.azurenative.datamigration.outputs.GetProjectResult;
import com.pulumi.azurenative.datamigration.outputs.GetServiceResult;
import com.pulumi.azurenative.datamigration.outputs.GetSqlMigrationServiceResult;
import com.pulumi.azurenative.datamigration.outputs.GetTaskResult;
import com.pulumi.azurenative.datamigration.outputs.ListSqlMigrationServiceAuthKeysResult;
import com.pulumi.azurenative.datamigration.outputs.ListSqlMigrationServiceMonitoringDataResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DatamigrationFunctions {
    /**
     * Database Migration Resource for SQL Database.
     * API Version: 2022-03-30-preview.
     * 
     */
    public static Output<GetDatabaseMigrationsSqlDbResult> getDatabaseMigrationsSqlDb(GetDatabaseMigrationsSqlDbArgs args) {
        return getDatabaseMigrationsSqlDb(args, InvokeOptions.Empty);
    }
    /**
     * Database Migration Resource for SQL Database.
     * API Version: 2022-03-30-preview.
     * 
     */
    public static CompletableFuture<GetDatabaseMigrationsSqlDbResult> getDatabaseMigrationsSqlDbPlain(GetDatabaseMigrationsSqlDbPlainArgs args) {
        return getDatabaseMigrationsSqlDbPlain(args, InvokeOptions.Empty);
    }
    /**
     * Database Migration Resource for SQL Database.
     * API Version: 2022-03-30-preview.
     * 
     */
    public static Output<GetDatabaseMigrationsSqlDbResult> getDatabaseMigrationsSqlDb(GetDatabaseMigrationsSqlDbArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:getDatabaseMigrationsSqlDb", TypeShape.of(GetDatabaseMigrationsSqlDbResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Database Migration Resource for SQL Database.
     * API Version: 2022-03-30-preview.
     * 
     */
    public static CompletableFuture<GetDatabaseMigrationsSqlDbResult> getDatabaseMigrationsSqlDbPlain(GetDatabaseMigrationsSqlDbPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getDatabaseMigrationsSqlDb", TypeShape.of(GetDatabaseMigrationsSqlDbResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A file resource
     * API Version: 2018-07-15-preview.
     * 
     */
    public static Output<GetFileResult> getFile(GetFileArgs args) {
        return getFile(args, InvokeOptions.Empty);
    }
    /**
     * A file resource
     * API Version: 2018-07-15-preview.
     * 
     */
    public static CompletableFuture<GetFileResult> getFilePlain(GetFilePlainArgs args) {
        return getFilePlain(args, InvokeOptions.Empty);
    }
    /**
     * A file resource
     * API Version: 2018-07-15-preview.
     * 
     */
    public static Output<GetFileResult> getFile(GetFileArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:getFile", TypeShape.of(GetFileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A file resource
     * API Version: 2018-07-15-preview.
     * 
     */
    public static CompletableFuture<GetFileResult> getFilePlain(GetFilePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getFile", TypeShape.of(GetFileResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A project resource
     * API Version: 2018-04-19.
     * 
     */
    public static Output<GetProjectResult> getProject(GetProjectArgs args) {
        return getProject(args, InvokeOptions.Empty);
    }
    /**
     * A project resource
     * API Version: 2018-04-19.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain(GetProjectPlainArgs args) {
        return getProjectPlain(args, InvokeOptions.Empty);
    }
    /**
     * A project resource
     * API Version: 2018-04-19.
     * 
     */
    public static Output<GetProjectResult> getProject(GetProjectArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A project resource
     * API Version: 2018-04-19.
     * 
     */
    public static CompletableFuture<GetProjectResult> getProjectPlain(GetProjectPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getProject", TypeShape.of(GetProjectResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Database Migration Service resource
     * API Version: 2018-04-19.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * A Database Migration Service resource
     * API Version: 2018-04-19.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * A Database Migration Service resource
     * API Version: 2018-04-19.
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A Database Migration Service resource
     * API Version: 2018-04-19.
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A SQL Migration Service.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static Output<GetSqlMigrationServiceResult> getSqlMigrationService(GetSqlMigrationServiceArgs args) {
        return getSqlMigrationService(args, InvokeOptions.Empty);
    }
    /**
     * A SQL Migration Service.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static CompletableFuture<GetSqlMigrationServiceResult> getSqlMigrationServicePlain(GetSqlMigrationServicePlainArgs args) {
        return getSqlMigrationServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * A SQL Migration Service.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static Output<GetSqlMigrationServiceResult> getSqlMigrationService(GetSqlMigrationServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:getSqlMigrationService", TypeShape.of(GetSqlMigrationServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A SQL Migration Service.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static CompletableFuture<GetSqlMigrationServiceResult> getSqlMigrationServicePlain(GetSqlMigrationServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getSqlMigrationService", TypeShape.of(GetSqlMigrationServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A task resource
     * API Version: 2018-04-19.
     * 
     */
    public static Output<GetTaskResult> getTask(GetTaskArgs args) {
        return getTask(args, InvokeOptions.Empty);
    }
    /**
     * A task resource
     * API Version: 2018-04-19.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTaskPlain(GetTaskPlainArgs args) {
        return getTaskPlain(args, InvokeOptions.Empty);
    }
    /**
     * A task resource
     * API Version: 2018-04-19.
     * 
     */
    public static Output<GetTaskResult> getTask(GetTaskArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * A task resource
     * API Version: 2018-04-19.
     * 
     */
    public static CompletableFuture<GetTaskResult> getTaskPlain(GetTaskPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:getTask", TypeShape.of(GetTaskResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An authentication key.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static Output<ListSqlMigrationServiceAuthKeysResult> listSqlMigrationServiceAuthKeys(ListSqlMigrationServiceAuthKeysArgs args) {
        return listSqlMigrationServiceAuthKeys(args, InvokeOptions.Empty);
    }
    /**
     * An authentication key.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static CompletableFuture<ListSqlMigrationServiceAuthKeysResult> listSqlMigrationServiceAuthKeysPlain(ListSqlMigrationServiceAuthKeysPlainArgs args) {
        return listSqlMigrationServiceAuthKeysPlain(args, InvokeOptions.Empty);
    }
    /**
     * An authentication key.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static Output<ListSqlMigrationServiceAuthKeysResult> listSqlMigrationServiceAuthKeys(ListSqlMigrationServiceAuthKeysArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:listSqlMigrationServiceAuthKeys", TypeShape.of(ListSqlMigrationServiceAuthKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * An authentication key.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static CompletableFuture<ListSqlMigrationServiceAuthKeysResult> listSqlMigrationServiceAuthKeysPlain(ListSqlMigrationServiceAuthKeysPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:listSqlMigrationServiceAuthKeys", TypeShape.of(ListSqlMigrationServiceAuthKeysResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Integration Runtime Monitoring Data.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static Output<ListSqlMigrationServiceMonitoringDataResult> listSqlMigrationServiceMonitoringData(ListSqlMigrationServiceMonitoringDataArgs args) {
        return listSqlMigrationServiceMonitoringData(args, InvokeOptions.Empty);
    }
    /**
     * Integration Runtime Monitoring Data.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static CompletableFuture<ListSqlMigrationServiceMonitoringDataResult> listSqlMigrationServiceMonitoringDataPlain(ListSqlMigrationServiceMonitoringDataPlainArgs args) {
        return listSqlMigrationServiceMonitoringDataPlain(args, InvokeOptions.Empty);
    }
    /**
     * Integration Runtime Monitoring Data.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static Output<ListSqlMigrationServiceMonitoringDataResult> listSqlMigrationServiceMonitoringData(ListSqlMigrationServiceMonitoringDataArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("azure-native:datamigration:listSqlMigrationServiceMonitoringData", TypeShape.of(ListSqlMigrationServiceMonitoringDataResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Integration Runtime Monitoring Data.
     * API Version: 2021-10-30-preview.
     * 
     */
    public static CompletableFuture<ListSqlMigrationServiceMonitoringDataResult> listSqlMigrationServiceMonitoringDataPlain(ListSqlMigrationServiceMonitoringDataPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("azure-native:datamigration:listSqlMigrationServiceMonitoringData", TypeShape.of(ListSqlMigrationServiceMonitoringDataResult.class), args, Utilities.withVersion(options));
    }
}
