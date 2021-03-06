package com.prisma.api.connector

import com.prisma.gc_values.{IdGCValue, ListGCValue, RootGCValue}

case class PrismaNode(id: IdGCValue, data: RootGCValue, typeName: Option[String] = None)

object PrismaNode {
  def dummy: PrismaNode = PrismaNode(IdGCValue(""), RootGCValue.empty)
}

case class PrismaNodeWithParent(parentId: IdGCValue, prismaNode: PrismaNode)

case class RelationNode(a: IdGCValue, b: IdGCValue)
case class ScalarListValues(nodeId: IdGCValue, value: ListGCValue)
